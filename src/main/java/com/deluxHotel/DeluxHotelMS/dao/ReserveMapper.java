package com.deluxHotel.DeluxHotelMS.dao;

import com.deluxHotel.DeluxHotelMS.bean.Reserve;
import com.deluxHotel.DeluxHotelMS.bean.ReserveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReserveMapper {
    long countByExample(ReserveExample example);

    int deleteByExample(ReserveExample example);

    int deleteByPrimaryKey(Integer reserveId);

    int insert(Reserve record);

    int insertSelective(Reserve record);

    List<Reserve> selectByExample(ReserveExample example);

    Reserve selectByPrimaryKey(Integer reserveId);

    int updateByExampleSelective(@Param("record") Reserve record, @Param("example") ReserveExample example);

    int updateByExample(@Param("record") Reserve record, @Param("example") ReserveExample example);

    int updateByPrimaryKeySelective(Reserve record);

    int updateByPrimaryKey(Reserve record);
}