package com.deluxHotel.DeluxHotelMS.action.back;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deluxHotel.DeluxHotelMS.bean.FacilityService;
import com.deluxHotel.DeluxHotelMS.biz.FacilityServiceBiz;
import com.deluxHotel.DeluxHotelMS.vo.Result;

@Controller
public class FacilityServiceAction {
	@Resource
	private FacilityServiceBiz facilityServiceBiz;
	@RequestMapping("back/loadFacilityServiceInfoByFacilityServiceId")
	@ResponseBody
	public List<FacilityService> loadFacilityServiceInfoByFacilityServiceId(int facilityServiceId) {
		return facilityServiceBiz.selectFacilityServiceById(facilityServiceId);
	}
	
	@RequestMapping("back/updateFacilityServiceInfo")
	@ResponseBody
	public Result updateFacilityServiceInfo(FacilityService facilityService) {
		facilityServiceBiz.updateFacilityService(facilityService);
		return new Result(1,"修改成功",null);
	}
}
