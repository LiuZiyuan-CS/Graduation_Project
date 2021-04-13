package com.deluxHotel.DeluxHotelMS.biz;

import java.io.File;
import java.io.IOException;
import java.net.BindException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.deluxHotel.DeluxHotelMS.bean.Staff;
import com.deluxHotel.DeluxHotelMS.bean.StaffExample;
import com.deluxHotel.DeluxHotelMS.biz.BizException;
import com.deluxHotel.DeluxHotelMS.dao.StaffMapper;
import com.deluxHotel.DeluxHotelMS.utils.MD5Util;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StaffBiz {
	@Autowired
	private StaffMapper staffMapper;
	@Autowired
	private MD5Util md5Util;
	@Value("${staffProfileAddr}")
	private  String staffProfileAddr;
	@Value("${staffDefaultProfileFileName}")
	private  String staffDefaultProfileFileName;
	/**
	 * 员工登录
	 * @param staff
	 * @return
	 * @throws BindException
	 */
	public Staff doLogin(Staff staff) throws BindException {
		StaffExample staffExample = new StaffExample();
		staffExample.createCriteria().andStaffNameEqualTo(staff.getStaffName())
				.andStaffPasswordEqualTo(md5Util.MD5(staff.getStaffPassword()));
		List<Staff> staffList = staffMapper.selectByExample(staffExample);
		if(staffList.size()==0) {
			throw new BindException("用户名或密码错误");
		}else {
			return staffList.get(0);
		}
		
	}
	/**
	 * 员工信息加载
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Staff> loadStaffInfo(int page, int pageSize) {
		PageHelper.startPage(page,pageSize);
		return new PageInfo<Staff>(staffMapper.selectByExample(null));
	}
	/**
	 * 更新员工数据
	 * @param staff
	 */
	public void updateStaffInfo(Staff staff) {
		staffMapper.updateByPrimaryKeySelective(staff);
	}
	/**
	 * 重置员工密码
	 * @param staff
	 */
	public void resetStaffPassword(Staff staff) {
		Staff record=new Staff();
		record.setStaffId(staff.getStaffId());
		System.out.println(staff.getStaffIdcard().substring(12, 18));
		record.setStaffPassword(md5Util.MD5(staff.getStaffIdcard().substring(13, 18)));
		staffMapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * 存储员工上传的头像文件
	 * @param profile
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public  String storeStaffProfile(MultipartFile profile) throws IllegalStateException, IOException {
		String profileName=profile.getOriginalFilename();
		String suffix=profileName.substring(profileName.lastIndexOf("."));
		String fileUUID = UUID.randomUUID().toString();
		//以磁盘路径创建文件
		File profileFile = new File(staffProfileAddr+fileUUID+"_staff"+suffix);
		profile.transferTo(profileFile);
		//thumbnailator.changeImgSize(userProfileAddr+fileUUID+suffix, userProfileAddr+fileUUID+suffix);
		return "../"+fileUUID+"_staff"+suffix;
	}
	public void uploadStaffProfile(Staff staff) {
		staffMapper.updateByPrimaryKeySelective(staff);
	}
	/**
	 * 通过身份证号码确认该员工是否已存在
	 * @param staff
	 * @throws BizException 
	 */
	public boolean staffIsExist(Staff staff) throws BizException {
		StaffExample staffExample= new StaffExample();
		staffExample.createCriteria().andStaffIdcardEqualTo(staff.getStaffIdcard());
		List<Staff> staffs=staffMapper.selectByExample(staffExample);
		if(staffs.size()!=0) {
			throw new BizException("该员工信息已存在！");
		}else {
			return true;
		}
	}
	/**
	 * 新增员工信息
	 * @param staff
	 */
	public void insertStaff(Staff staff) {
		staff.setStaffProfile(staffDefaultProfileFileName);
		/****/
		String staffPassword=md5Util.MD5(staff.getStaffIdcard().substring(12,18));
		staff.setStaffPassword(staffPassword);
		staffMapper.insert(staff);
	}

}
