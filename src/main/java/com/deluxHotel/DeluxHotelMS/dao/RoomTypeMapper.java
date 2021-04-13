package com.deluxHotel.DeluxHotelMS.dao;

import com.deluxHotel.DeluxHotelMS.bean.RoomType;
import com.deluxHotel.DeluxHotelMS.bean.RoomTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomTypeMapper {
    long countByExample(RoomTypeExample example);

    int deleteByExample(RoomTypeExample example);

    int deleteByPrimaryKey(Integer roomTypeId);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    List<RoomType> selectByExample(RoomTypeExample example);

    RoomType selectByPrimaryKey(Integer roomTypeId);

    int updateByExampleSelective(@Param("record") RoomType record, @Param("example") RoomTypeExample example);

    int updateByExample(@Param("record") RoomType record, @Param("example") RoomTypeExample example);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKey(RoomType record);
}