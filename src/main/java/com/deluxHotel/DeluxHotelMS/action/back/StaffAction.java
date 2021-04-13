package com.deluxHotel.DeluxHotelMS.action.back;

import java.io.IOException;
import java.net.BindException;

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

import com.deluxHotel.DeluxHotelMS.bean.Staff;
import com.deluxHotel.DeluxHotelMS.biz.StaffBiz;
import com.deluxHotel.DeluxHotelMS.biz.BizException;
import com.deluxHotel.DeluxHotelMS.vo.Result;
import com.github.pagehelper.PageInfo;

@Controller
public class StaffAction {
	@Resource
	private StaffBiz staffBiz;

	@GetMapping("back/sign-in.html")
	public String goTosignIn() {
		return "back/sign-in";
	}
	@GetMapping("back/sign-up.html")
	public String goTosignUp() {
		return "back/sign-up";
	}
	@RequestMapping("back/doLogin")
	@ResponseBody
	public Result doLogin(@RequestParam(defaultValue = "0")String rememberStaffName, Staff staff, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		Staff loginStaff;
		try {
			loginStaff = staffBiz.doLogin(staff);

			httpServletRequest.getSession().setAttribute("loginStaff", loginStaff);
			// 当用户勾选记住我时，将用户名记入cookie中
			if (rememberStaffName.equals("1")) {
				Cookie cookie = new Cookie("rememberStaffName", loginStaff.getStaffName());
				// 15天过期
				cookie.setMaxAge(15 * 24 * 60 * 60);
				httpServletResponse.addCookie(cookie);
			}
			return new Result(1, "success", null);
		} catch (BindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(0, e.getMessage(), null);
		}
	}
	
	@GetMapping("back/index.html")
	public String index() {
		return "back/index";
	}
	@GetMapping("back/staffinfo.html")
	public String staffInfo() {
		return "back/staffinfo";
	}
	@RequestMapping("back/loadStaffInfo")
	@ResponseBody
	public PageInfo<Staff> loadStaffInfo(@RequestParam(defaultValue = "1")int pageNumber,@RequestParam(defaultValue = "10")int limit) {
		return staffBiz.loadStaffInfo(pageNumber,limit);
	}
	@RequestMapping("back/updateStaffInfo")
	@ResponseBody
	public Result updateStaffInfo(Staff staff) {
		System.out.println(staff.toString());
		staffBiz.updateStaffInfo(staff);
		return new Result(1,"修改成功",null);
	}
	
	@RequestMapping("back/resetStaffPassword")
	@ResponseBody
	public Result resetStaffPassword(Staff staff) {
		System.out.println(staff.toString());
		staffBiz.resetStaffPassword(staff);
		return new Result(1,"重置密码成功！",null);
	}

	@RequestMapping("back/staffProfileUpload")
	@ResponseBody
	public Result profileUpload(@RequestParam("profile-icon")MultipartFile profile,Staff staff)   {
		String staffProfile;
		try {
			staffProfile = staffBiz.storeStaffProfile(profile);
			staff.setStaffProfile(staffProfile);
			staffBiz.uploadStaffProfile(staff);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			return new Result(0, "系统繁忙，请稍后再试", null);
		}
		return new Result(1, "success", staffProfile);
	}
	@RequestMapping("back/insertStaff")
	@ResponseBody
	public Result insertStaff(Staff staff) {
		try {
			if(staffBiz.staffIsExist(staff)) {
				staffBiz.insertStaff(staff);
				return new Result(1,"新增员工信息成功，员工登录初始密码是身份证后六位！");
			}
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(0,e.getMessage(),null);
		}
		return null;
	}
}

	

