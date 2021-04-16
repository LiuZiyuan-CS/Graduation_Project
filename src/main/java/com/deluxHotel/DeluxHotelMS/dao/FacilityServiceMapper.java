package com.deluxHotel.DeluxHotelMS.dao;

import com.deluxHotel.DeluxHotelMS.bean.FacilityService;
import com.deluxHotel.DeluxHotelMS.bean.FacilityServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FacilityServiceMapper {
    long countByExample(FacilityServiceExample example);

    int deleteByExample(FacilityServiceExample example);

    int deleteByPrimaryKey(Integer facilityServiceId);

    int insert(FacilityService record);

    int insertSelective(FacilityService record);

    List<FacilityService> selectByExample(FacilityServiceExample example);

    FacilityService selectByPrimaryKey(Integer facilityServiceId);

    int updateByExampleSelective(@Param("record") FacilityService record, @Param("example") FacilityServiceExample example);

    int updateByExample(@Param("record") FacilityService record, @Param("example") FacilityServiceExample example);

    int updateByPrimaryKeySelective(FacilityService record);

    int updateByPrimaryKey(FacilityService record);
}