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
	/**
	 * 修改房型信息
	 * @param roomType  前端传输房型的相关信息
	 * @return
	 */
	@RequestMapping("back/updateRoomTypeInfo")
	@ResponseBody
	public Result updateRoomTypeInfo(RoomType roomType) {
		roomTypeBiz.updateRoomType(roomType);
		return new Result(1,"修改成功",null);
	}
	/**
	 * 新增房型
	 * @param roomTypePic     房型图片
	 * @param roomType		      前台新增房型信息
	 * @param facilityService 房型对应的服务信息
	 * @return
	 */
	@RequestMapping("back/addRoomType")
	@ResponseBody
	public Result addRoomType(@RequestParam("roomPic")MultipartFile roomTypePic,RoomType roomType,FacilityService facilityService) {
		/**
		 * 先验证roomTypeNumber和roomTypeName是否唯一，如果唯一则先将房型对应的服务信息插入FacilityService表，
		 * 返回的主键作为roomType的一个参数，再插入房型信息到RoomType表
		 */
		try {
			if(roomTypeBiz.isRoomTypeNumberAndRoomTypeNameUnique(roomType)) {
				String roomTypePicAddr=roomTypeBiz.storeRoomTypePic(roomTypePic);
				roomType.setRoomTypePic(roomTypePicAddr);
				int facilityServiceId=facilityServiceBiz.addFacilityService(facilityService);
				roomType.setFacilityServiceId(facilityServiceId);
				roomTypeBiz.addRoomtype(roomType);
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
