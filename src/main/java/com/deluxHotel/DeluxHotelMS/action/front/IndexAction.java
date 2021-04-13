package com.deluxHotel.DeluxHotelMS.action.front;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.deluxHotel.DeluxHotelMS.bean.User;
import com.deluxHotel.DeluxHotelMS.biz.front.BizException;
import com.deluxHotel.DeluxHotelMS.biz.front.RoomTypeBiz;
import com.deluxHotel.DeluxHotelMS.biz.front.UserBiz;
import com.deluxHotel.DeluxHotelMS.vo.Result;

@Controller
public class IndexAction {
	@Resource
	private UserBiz userBiz;
	@Resource 
	private RoomTypeBiz roomTypeBiz;
	/**
	 * 首页跳转
	 * 
	 * @return
	 */
	@GetMapping("front/index.html")
	public String index(HttpServletRequest httpServletRequest) {
		//主页相关内容注入
		httpServletRequest.getSession().setAttribute("roomTypeInfo", roomTypeBiz.selectRoomType());
		return "front/index";
	}

	/**
	 * 前台用户登录界面跳转
	 * 
	 * @return
	 */
	@GetMapping("front/signIn.html")
	public String signIn() {
		return "front/sign-in";
	}

	/**
	 * 前台登录
	 * 
	 * @param user
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping("front/dologin")
	@ResponseBody
	public Result dologin(@RequestParam(defaultValue = "0")String rememberUsername, User user, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		try {
			User loginUser = userBiz.doLogin(user);
			httpServletRequest.getSession().setAttribute("loginUser", loginUser);
			// 当用户勾选记住我时，将用户名记入cookie中
			if (rememberUsername.equals("1")) {
				Cookie cookie = new Cookie("remeberUsername", loginUser.getUserName());
				// 15天过期
				cookie.setMaxAge(15 * 24 * 60 * 60);
				httpServletResponse.addCookie(cookie);
			}
			return new Result(1, "success", loginUser);
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(0, e.getMessage(), null);
		}
	}

	/**
	 * 注册
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("front/doreg")
	@ResponseBody
	public Result doreg(User user) {
		try {
			userBiz.register(user);
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(0, "failed", null);
		}
		return new Result(1, "success", null);
	}
	/**
	 * 发送验证码
	 * @param user
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping("front/sendVerificationCode")
	@ResponseBody
	public Result sendVerificationCode(User user, HttpServletRequest httpServletRequest) {
		try {
			if (userBiz.userAndEmailIsValid(user)) {
				String verificationCode = userBiz.sendVerificationCode(user.getUserEmail());
				httpServletRequest.getSession().setAttribute("verificationCode", verificationCode);
				httpServletRequest.getSession().setAttribute("validTime",
						new Date(System.currentTimeMillis() + 3 * 60 * 1000));
				httpServletRequest.getSession().setAttribute("orginalUser", user);
				return new Result(1, "验证码已发送，请注意查收！", null);
			}
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(0, e.getMessage(), null);
		}
		return null;
	}

	/**
	 * 重置密码
	 * @param user
	 * @param verificationCode
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping("front/resetPassword")
	@ResponseBody
	public Result resetPassword(User user, String verificationCode, HttpServletRequest httpServletRequest) {
		System.out.println(user + "+++++++" + verificationCode);
		User orginalUser = (User) httpServletRequest.getSession().getAttribute("orginalUser");
		String realVerificationCode = String.valueOf(httpServletRequest.getSession().getAttribute("verificationCode"));
		Date validTime=(Date) httpServletRequest.getSession().getAttribute("validTime");
		try {
			if (userBiz.InfoIsValid(user, verificationCode, realVerificationCode, orginalUser,validTime)) {
				userBiz.resetPassword(user);
			}
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(0,e.getMessage(),null);
		}
		return new Result(1,"密码重置成功，3秒后将会跳转到登陆界面",null);
	}
	
	/**
	 * 更新用户头像
	 * @param profile
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping("front/userProfileUpload")
	@ResponseBody
	public Result profileUpload(@RequestParam("profile-icon")MultipartFile profile,HttpServletRequest httpServletRequest)   {
		User user=(User)httpServletRequest.getSession().getAttribute("loginUser");
		String userProfile;
		try {
			userProfile = userBiz.storeUserProfile(profile);
			user.setUserProfile(userProfile);
			userBiz.uploadUserProfile(user);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			return new Result(0,"系统繁忙，请稍后再试",null);
		}
		return new Result(1,"success",userProfile);
	}
	
	/**
	 * 登出
	 * 
	 * @throws IOException
	 */
	@GetMapping("front/signOut")
	public void signOut(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException {
		httpServletRequest.getSession().removeAttribute("loginUser");
		httpServletResponse.sendRedirect("index.html");
	}
	@RequestMapping("front/checkAvailableRoom")
	public Result checkAvailableRoom(){
		return null;
	}
	
}
