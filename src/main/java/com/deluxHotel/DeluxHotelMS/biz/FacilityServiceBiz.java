package com.deluxHotel.DeluxHotelMS.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deluxHotel.DeluxHotelMS.bean.FacilityService;
import com.deluxHotel.DeluxHotelMS.bean.FacilityServiceExample;
import com.deluxHotel.DeluxHotelMS.dao.FacilityServiceMapper;

@Service
public class FacilityServiceBiz {
	@Autowired
	private FacilityServiceMapper facilityServiceMapper;

	public List<FacilityService> selectFacilityServiceById(int facilityServiceId) {
		FacilityServiceExample facilityServiceExample=new FacilityServiceExample();
		facilityServiceExample.createCriteria().andFacilityServiceIdEqualTo(facilityServiceId);
		return facilityServiceMapper.selectByExample(facilityServiceExample);
	}

	public void updateFacilityService(FacilityService facilityService) {
		facilityServiceMapper.updateByPrimaryKeySelective(facilityService);
	}

	public int addFacilityService(FacilityService facilityService) {
		return facilityServiceMapper.insertSelective(facilityService);
	}
}
