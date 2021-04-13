package com.deluxHotel.DeluxHotelMS.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deluxHotel.DeluxHotelMS.bean.RoomType;
import com.deluxHotel.DeluxHotelMS.bean.RoomTypeExample;
import com.deluxHotel.DeluxHotelMS.dao.RoomTypeMapper;
import com.github.pagehelper.PageHelper;

@Service
public class RoomTypeBiz {
	@Autowired
	private RoomTypeMapper roomTypeMapper;
	
	public List<RoomType> selectRoomType() {
		PageHelper.startPage(1,6);
		return roomTypeMapper.selectByExample(null);
	}

	public RoomType selectRoomTypeByRoomTypeNumber(String roomTypeNumber) {
		RoomTypeExample roomTypeExample=new RoomTypeExample();
		roomTypeExample.createCriteria().andRoomTypeNumberEqualTo(roomTypeNumber);
		List<RoomType> roomType=roomTypeMapper.selectByExample(roomTypeExample);
		return roomType.get(0);
	}

}
