package com.deluxHotel.DeluxHotelMS.action.back;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deluxHotel.DeluxHotelMS.bean.RoomType;
import com.deluxHotel.DeluxHotelMS.biz.RoomTypeBiz;
import com.github.pagehelper.PageInfo;
/**
 * 房型controller 
 * @author LiuZiyuan
 */
@Controller
public class RoomTypeAction {
	@Resource
	private RoomTypeBiz roomTypeBiz; //房型业务
	/**
	 * 跳转到房型信息页面
	 * @return
	 */
	@GetMapping("back/roomtypeinfo.html")
	public String goToRoomTypeInfo() {
		return "back/roomtypeinfo";
	}
	@RequestMapping("back/loadRoomTypeInfo")
	@ResponseBody
	public PageInfo<RoomType> loadRoomTypeInfo(@RequestParam(defaultValue = "1")int pageNumber,@RequestParam(defaultValue = "10")int limit) {
		return roomTypeBiz.loadRoomTypeInfo(pageNumber,limit);
	}
}
