package com.deluxHotel.DeluxHotelMS.biz.front;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.deluxHotel.DeluxHotelMS.bean.User;
import com.deluxHotel.DeluxHotelMS.bean.UserExample;
import com.deluxHotel.DeluxHotelMS.dao.UserMapper;
import com.deluxHotel.DeluxHotelMS.utils.MD5Util;
import com.deluxHotel.DeluxHotelMS.utils.ThumbnailatorUtil;
import com.deluxHotel.DeluxHotelMS.utils.VerificationCodeUtil;

//毕业设计 UserBiz业务
@Service
public class UserBiz {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private MD5Util MD5Util;
	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
	private ThumbnailatorUtil thumbnailator;
	@Value("${mail.sender.addr}")
	private String senderAddr;
	@Value("${userProfileAddr}")
	private  String userProfileAddr;

	public User doLogin(User user) throws BizException {
		// 判断userName和password是否为空
		if (user.getUserName() == null || user.getUserPassword() == null) {
			throw new BizException("请输入用户名或密码！");
		}
		// 将网页传递的数据与数据库中数据进行匹配

		UserExample userExample = new UserExample();
		userExample.or().andUserNameEqualTo(user.getUserName())
				.andUserPasswordEqualTo(MD5Util.MD5(user.getUserPassword()));
		userExample.or().andUserTelephoneEqualTo(user.getUserName())
				.andUserPasswordEqualTo(MD5Util.MD5(user.getUserPassword()));
		userExample.or().andUserEmailEqualTo(user.getUserName())
				.andUserPasswordEqualTo(MD5Util.MD5(user.getUserPassword()));
		List<User> userList = userMapper.selectByExample(userExample);
		if (userList.size() == 0) {
			throw new BizException("输入用户用户名或密码不正确，请确认后输入！");
		} else {
			user = userList.get(0);
			user.setUserPassword(null);
			return user;
		}
	}

	public void register(User user) throws BizException {
		user.setUserPassword(MD5Util.MD5(user.getUserPassword()));
		user.setUserProfile("../default_user.jpg");
		userMapper.insertSelective(user);
	}

	/**
	 * 验证用户姓名和邮箱是否存在
	 * @param user
	 * @return
	 * @throws BizException
	 */
	public boolean userAndEmailIsValid(User user) throws BizException {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserNameEqualTo(user.getUserName()).andUserEmailEqualTo(user.getUserEmail());
		
		List<User> userList = userMapper.selectByExample(userExample);
		if (userList.size() == 0) {
			throw new BizException("您输入的用户名或邮箱地址不存在");
		} else {
			return true;
		}
	}
	
	/**
	 * 发送邮箱验证码
	 * @param EmailAddr
	 * @return
	 */
	public String sendVerificationCode(String EmailAddr) {
		// 获取验证码工具类
		VerificationCodeUtil verificationCodeUtil = new VerificationCodeUtil();

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		simpleMailMessage.setFrom(senderAddr);

		simpleMailMessage.setTo(EmailAddr);

		simpleMailMessage.setSubject("Delux酒店用户登录密码找回");
		// 获取验证码
		String verificationCode = verificationCodeUtil.generateVerificationCode();

		simpleMailMessage.setText("您的找回密码的验证码为： " + verificationCode + " (有效时间为3分钟)，请勿将该验证码告诉任何人！");

		javaMailSender.send(simpleMailMessage);

		return verificationCode;
	}


	public boolean InfoIsValid(User user, String verificationCode, String realVerificationCode, User orginalUser,
			Date validTime) throws BizException {
		if(!user.getUserName().equals(orginalUser.getUserName())) {
			throw new BizException("重置密码的相关账户信息发生改变，请重新申请验证码");
		}
		if(!user.getUserEmail().equals(orginalUser.getUserEmail())) {
			throw new BizException("重置密码的相关账户信息发生改变，请重新申请验证码");
		}
		if(!realVerificationCode.equals(verificationCode)) {
			throw new BizException("验证码不正确");
		}
		if(!validTime.after(new Date(System.currentTimeMillis()))){
			throw new BizException("验证码已失效请重新设置验证码");
		}
		return true;
	}

	public void resetPassword(User user) {
		UserExample userExample=new UserExample();
		userExample.createCriteria().andUserNameEqualTo(user.getUserName()).andUserEmailEqualTo(user.getUserEmail());
		User record=new User();
		record.setUserPassword(MD5Util.MD5(user.getUserPassword()));
		userMapper.updateByExampleSelective(record,userExample);
	}
	/**
	 * 存储用户上传的头像文件
	 * @param profile
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public  String storeUserProfile(MultipartFile profile) throws IllegalStateException, IOException {
		String profileName=profile.getOriginalFilename();
		String suffix=profileName.substring(profileName.lastIndexOf("."));
		String fileUUID = UUID.randomUUID().toString();
		//以磁盘路径创建文件
		File profileFile = new File(userProfileAddr+fileUUID+"_user"+suffix);
		profile.transferTo(profileFile);
		//thumbnailator.changeImgSize(userProfileAddr+fileUUID+suffix, userProfileAddr+fileUUID+suffix);
		return "../"+fileUUID+"_user"+suffix;
	}

	public void uploadUserProfile(User user) {
		user.setUserPassword(null);
		userMapper.updateByPrimaryKeySelective(user);
	}


	
}
