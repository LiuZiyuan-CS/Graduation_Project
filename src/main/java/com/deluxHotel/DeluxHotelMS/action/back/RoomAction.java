package com.deluxHotel.DeluxHotelMS.action.back;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deluxHotel.DeluxHotelMS.bean.Room;
import com.deluxHotel.DeluxHotelMS.biz.BizException;
import com.deluxHotel.DeluxHotelMS.biz.RoomBiz;
import com.deluxHotel.DeluxHotelMS.biz.RoomTypeBiz;
import com.deluxHotel.DeluxHotelMS.vo.Result;
import com.github.pagehelper.PageInfo;

@Controller
public class RoomAction {
	@Resource 
	private RoomBiz roomBiz;
	@Resource
	private RoomTypeBiz roomTypeBiz;
	
	/**
	 * 跳转房间信息页面
	 * @return
	 */
	@GetMapping("back/roominfo.html")
	public String goToRoomInfo(Model model) {
		model.addAttribute("roomTypeList",roomTypeBiz.loadAllRoomType());
		return "back/roominfo";
	}
	
	/**
	 * 加载房间信息
	 * @param pageNumber	请求的页号
	 * @param limit			请求的页面数据条数
	 * @return
	 */
	@RequestMapping("back/loadRoomInfo")
	@ResponseBody
	public PageInfo<Room> loadRoomInfo(@RequestParam(defaultValue = "1")int pageNumber,@RequestParam(defaultValue = "10")int limit){
		return roomBiz.loadRoomInfo(pageNumber,limit);
	}
	/**
	 * 禁用房间
	 * @param room	房间信息（仅含有id，status后台手动设置）
	 * @return
	 */
	@RequestMapping("back/banRoom")
	@ResponseBody
	public Result banRoom(Room room) {
		roomBiz.banRoom(room);
		return new Result(1,"状态更换成功",null);
	}
	
	@RequestMapping("back/enableRoom")
	@ResponseBody
	public Result enableRoom(Room room) {
		roomBiz.enableRoom(room);
		return new Result(1,"状态更换成功",null);
	}
	
	@RequestMapping("back/updateRoomInfo")
	@ResponseBody
	public Result updateRoomInfo(Room room) {
		roomBiz.updateRoomInfo(room);
		return new Result(1,"房间信息修改成功",null);
	}
	
	@RequestMapping("back/addRoom")
	@ResponseBody
	public Result addRoom(Room room) {
		try {
			if(roomBiz.RoomNumberIsUnique(room.getRoomNumber())) {
				roomBiz.addRoom(room);
				return new Result(1,"添加房间成功！",null);
			}
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(0,e.getMessage(),null);
		}
		return null;
	}
}
