package com.deluxHotel.DeluxHotelMS.biz;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.deluxHotel.DeluxHotelMS.bean.RoomType;
import com.deluxHotel.DeluxHotelMS.bean.RoomTypeExample;
import com.deluxHotel.DeluxHotelMS.dao.RoomTypeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoomTypeBiz {
	@Autowired
	private RoomTypeMapper roomTypeMapper;
	@Value("${roomType.picture.dir}")
	private  String roomTypePictureDir;
	
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

	public PageInfo<RoomType> loadRoomTypeInfo(int page, int pageSize) {
		PageHelper.startPage(page,pageSize);
		System.out.println(roomTypeMapper.selectByExample(null));
		return new PageInfo<RoomType>(roomTypeMapper.selectByExample(null));
	}

	public void updateRoomType(RoomType roomType) {
		RoomTypeExample roomTypeExample=new RoomTypeExample();
		roomTypeExample.createCriteria().andRoomTypeNumberEqualTo(roomType.getRoomTypeNumber());
		roomTypeMapper.updateByExampleSelective(roomType, roomTypeExample);
	}

	public boolean isRoomTypeNumberAndRoomTypeNameUnique(RoomType roomType) throws BizException {
		RoomTypeExample roomTypeExample = new RoomTypeExample();
		roomTypeExample.createCriteria().andRoomTypeNumberEqualTo(roomType.getRoomTypeNumber());
		if(roomTypeMapper.selectByExample(roomTypeExample).size()!=0) {
		}
		roomTypeExample.clear();
		roomTypeExample.createCriteria().andRoomTypeNameEqualTo(roomType.getRoomTypeName());
		if(roomTypeMapper.selectByExample(roomTypeExample).size()!=0) {
			throw new BizException("??????????????????????????????????????????");
		}
		return true;
	}

	public String storeRoomTypePic(MultipartFile roomTypePic) throws IllegalStateException, IOException {
		String profileName=roomTypePic.getOriginalFilename();
		String suffix=profileName.substring(profileName.lastIndexOf("."));
		String fileUUID = UUID.randomUUID().toString();
		//???????????????????????????
		File roomTypePicFile = new File(roomTypePictureDir+fileUUID+suffix);
		roomTypePic.transferTo(roomTypePicFile);
		System.out.println("????????????????????????");
		return "../"+fileUUID+suffix;
	}

	public void addRoomtype(RoomType roomType) {
		roomTypeMapper.insertSelective(roomType);
	}

	public List<RoomType> loadAllRoomType() {
		return roomTypeMapper.selectByExample(null);
	}

}
