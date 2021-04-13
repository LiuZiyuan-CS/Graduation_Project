package com.deluxHotel.DeluxHotelMS.action.front;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deluxHotel.DeluxHotelMS.biz.front.RoomTypeBiz;
import com.deluxHotel.DeluxHotelMS.vo.Result;

@Controller
public class Roomdetail {

	@Resource
	private RoomTypeBiz roomTypeBiz;

	@GetMapping("front/rooms-detail.html")
	public String roomsDetail(@RequestParam(defaultValue = "0") String roomTypeNumber, Model model) {
		model.addAttribute("roomType", roomTypeBiz.selectRoomTypeByRoomTypeNumber(roomTypeNumber));
		return "front/rooms-detail";
	}

	@RequestMapping("front/checkAvailableRoomInRoomDetailPage")
	@ResponseBody
	public Result checkAvailableRoomInRoomDetailPage(String roomTypeNumber, String checkInDate, String checkOutDate,
			String adultNum, String childNum) {
		System.out.println("roomTypeNumber"+roomTypeNumber);
		System.out.println("checkInDate"+checkInDate);
		System.out.println("checkOutDate"+checkOutDate);
		System.out.println("adultNum"+adultNum);
		System.out.println("childNum"+childNum);
		return null;
	}
}
