package com.deluxHotel.DeluxHotelMS.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deluxHotel.DeluxHotelMS.bean.Room;
import com.deluxHotel.DeluxHotelMS.bean.RoomExample;
import com.deluxHotel.DeluxHotelMS.dao.RoomMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoomBiz {

	@Autowired
	private RoomMapper roomMapper;
	
	/**
	 * 加载房间信息
	 * @param pageNumber	页号
	 * @param pageSize		页面数据条数
	 * @return
	 */
	public PageInfo<Room> loadRoomInfo(int pageNumber, int pageSize) {
		PageHelper.startPage(pageNumber, pageSize);
		return new PageInfo<Room>(roomMapper.selectByExample(null));
	}

	public void banRoom(Room room) {
		RoomExample roomExample=new RoomExample();
		roomExample.createCriteria().andRoomIdEqualTo(room.getRoomId());
		room.setRoomStatus("0");
		roomMapper.updateByPrimaryKeySelective(room);
	}

	public void enableRoom(Room room) {
		RoomExample roomExample=new RoomExample();
		roomExample.createCriteria().andRoomIdEqualTo(room.getRoomId());
		room.setRoomStatus("1");
		roomMapper.updateByPrimaryKeySelective(room);
	}

	public void updateRoomInfo(Room room) {
		RoomExample roomExample=new RoomExample();
		roomExample.createCriteria().andRoomNumberEqualTo(room.getRoomNumber());
		roomMapper.updateByExampleSelective(room, roomExample);
	}

	public boolean RoomNumberIsUnique(String roomNumber) throws BizException {
		RoomExample roomExample=new RoomExample();
		roomExample.createCriteria().andRoomNumberEqualTo(roomNumber);
		if(roomMapper.selectByExample(roomExample).size()!=0) {
			throw new BizException("该房间号已被使用，请查验后再填写");
		}
		return true;
	}

	public void addRoom(Room room) {
		roomMapper.insert(room);
	}
}
