package com.deluxHotel.DeluxHotelMS.bean;

public class RoomType {
    private Integer roomTypeId;

    private String roomTypeNumber;

    private String roomTypeName;

    private String roomTypePrice;

    private String roomTypeSize;

    private String roomTypeAdult;

    private String roomTypeChild;

    private String roomTypeAvailableNumber;

    private String roomTypeIntrodution;

    private String roomTypePic;

    private Integer facilityServiceId;
    
    private FacilityService facilityService;

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomTypeNumber() {
        return roomTypeNumber;
    }

    public void setRoomTypeNumber(String roomTypeNumber) {
        this.roomTypeNumber = roomTypeNumber == null ? null : roomTypeNumber.trim();
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName == null ? null : roomTypeName.trim();
    }

    public String getRoomTypePrice() {
        return roomTypePrice;
    }

    public void setRoomTypePrice(String roomTypePrice) {
        this.roomTypePrice = roomTypePrice == null ? null : roomTypePrice.trim();
    }

    public String getRoomTypeSize() {
        return roomTypeSize;
    }

    public void setRoomTypeSize(String roomTypeSize) {
        this.roomTypeSize = roomTypeSize == null ? null : roomTypeSize.trim();
    }

    public String getRoomTypeAdult() {
        return roomTypeAdult;
    }

    public void setRoomTypeAdult(String roomTypeAdult) {
        this.roomTypeAdult = roomTypeAdult == null ? null : roomTypeAdult.trim();
    }

    public String getRoomTypeChild() {
        return roomTypeChild;
    }

    public void setRoomTypeChild(String roomTypeChild) {
        this.roomTypeChild = roomTypeChild == null ? null : roomTypeChild.trim();
    }

    public String getRoomTypeAvailableNumber() {
        return roomTypeAvailableNumber;
    }

    public void setRoomTypeAvailableNumber(String roomTypeAvailableNumber) {
        this.roomTypeAvailableNumber = roomTypeAvailableNumber == null ? null : roomTypeAvailableNumber.trim();
    }

    public String getRoomTypeIntrodution() {
        return roomTypeIntrodution;
    }

    public void setRoomTypeIntrodution(String roomTypeIntrodution) {
        this.roomTypeIntrodution = roomTypeIntrodution == null ? null : roomTypeIntrodution.trim();
    }

    public String getRoomTypePic() {
        return roomTypePic;
    }

    public void setRoomTypePic(String roomTypePic) {
        this.roomTypePic = roomTypePic == null ? null : roomTypePic.trim();
    }

    public Integer getFacilityServiceId() {
        return facilityServiceId;
    }

    public void setFacilityServiceId(Integer facilityServiceId) {
        this.facilityServiceId = facilityServiceId;
    }

	public FacilityService getFacilityService() {
		return facilityService;
	}

	public void setFacilityService(FacilityService facilityService) {
		this.facilityService = facilityService;
	}

	@Override
	public String toString() {
		return "RoomType [roomTypeId=" + roomTypeId + ", roomTypeNumber=" + roomTypeNumber + ", roomTypeName="
				+ roomTypeName + ", roomTypePrice=" + roomTypePrice + ", roomTypeSize=" + roomTypeSize
				+ ", roomTypeAdult=" + roomTypeAdult + ", roomTypeChild=" + roomTypeChild + ", roomTypeAvailableNumber="
				+ roomTypeAvailableNumber + ", roomTypeIntrodution=" + roomTypeIntrodution + ", roomTypePic="
				+ roomTypePic + ", facilityServiceId=" + facilityServiceId + ", facilityService=" + facilityService
				+ "]";
	}
    
}