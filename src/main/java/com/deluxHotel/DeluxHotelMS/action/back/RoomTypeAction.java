package com.deluxHotel.DeluxHotelMS.action.back;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deluxHotel.DeluxHotelMS.biz.RoomTypeBiz;
/**
 * 房型controller 
 * @author LiuZiyuan
 */
@Controller
public class RoomTypeAction {
	@Resource
	private RoomTypeBiz roomTypeBiz; //房型业务
	@RequestMapping("back/roomtypeinfo.html")
	public String goToRoomTypeInfo() {
		return "back/roomtypeinfo";
	}
}
