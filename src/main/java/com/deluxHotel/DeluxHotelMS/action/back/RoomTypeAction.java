package com.deluxHotel.DeluxHotelMS.action.back;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.deluxHotel.DeluxHotelMS.bean.FacilityService;
import com.deluxHotel.DeluxHotelMS.bean.RoomType;
import com.deluxHotel.DeluxHotelMS.biz.BizException;
import com.deluxHotel.DeluxHotelMS.biz.FacilityServiceBiz;
import com.deluxHotel.DeluxHotelMS.biz.RoomTypeBiz;
import com.deluxHotel.DeluxHotelMS.vo.Result;
import com.github.pagehelper.PageInfo;
/**
 * 房型controller 
 * @author LiuZiyuan
 */
@Controller
public class RoomTypeAction {
	@Resource
	private RoomTypeBiz roomTypeBiz; //房型业务
	@Resource
	private FacilityServiceBiz facilityServiceBiz; //房型服务业务
	/**
	 * 跳转到房型信息页面
	 * @return
	 */
	@GetMapping("back/roomtypeinfo.html")
	public String goToRoomTypeInfo() {
		return "back/roomtypeinfo";
	}
	/**
	 * 加载房型信息
	 * @param pageNumber 页数
	 * @param limit      每一页的展示个数
	 * @return
	 */
	@RequestMapping("back/loadRoomTypeInfo")
	@ResponseBody
	public PageInfo<RoomType> loadRoomTypeInfo(@RequestParam(defaultValue = "1")int pageNumber,@RequestParam(defaultValue = "10")int limit) {
		return roomTypeBiz.loadRoomTypeInfo(pageNumber,limit);
	}
	@RequestMapping("back/updateRoomTypeInfo")
	@ResponseBody
	public Result updateRoomTypeInfo(RoomType roomType) {
		roomTypeBiz.updateRoomType(roomType);
		return new Result(1,"修改成功",null);
	}
	@RequestMapping("back/addRoomType")
	@ResponseBody
	public Result addRoomType(@RequestParam("roomPic")MultipartFile roomTypePic,RoomType roomType,FacilityService facilityService) {
		System.out.println(roomType.toString());
		System.out.println(facilityService.toString());
		System.out.println(roomTypePic.getOriginalFilename());
		try {
			if(roomTypeBiz.isRoomTypeNumberAndRoomTypeNameUnique(roomType)) {
				System.out.println("开始添加图片");
				String roomTypePicAddr=roomTypeBiz.storeRoomTypePic(roomTypePic);
				roomType.setRoomTypePic(roomTypePicAddr);
				int facilityServiceId=facilityServiceBiz.addFacilityService(facilityService);
				roomType.setFacilityServiceId(facilityServiceId);
				roomTypeBiz.addRoomtype(roomType);
				System.out.println("新增房型成功！！！！！！");
			}
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(0,e.getMessage(),null);
		} catch(IllegalStateException | IOException e) {
			return new Result(0,"系统繁忙，请稍后再试",null);
		}
		return new Result(1,"添加成功",null);
	}
}
