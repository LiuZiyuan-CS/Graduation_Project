package com.deluxHotel.DeluxHotelMS.bean;

public class FacilityService {
    private Integer facilityServiceId;

    private String facilityServiceBedType;

    private String facilityServiceBedNumber;

    private String facilityServiceWifi;

    private String facilityServiceRoomService;

    private String facilityServiceBreakfast;

    private String facilityServiceLaundry;

    private String facilityServiceTransferService;

    public Integer getFacilityServiceId() {
        return facilityServiceId;
    }

    public void setFacilityServiceId(Integer facilityServiceId) {
        this.facilityServiceId = facilityServiceId;
    }

    public String getFacilityServiceBedType() {
        return facilityServiceBedType;
    }

    public void setFacilityServiceBedType(String facilityServiceBedType) {
        this.facilityServiceBedType = facilityServiceBedType == null ? null : facilityServiceBedType.trim();
    }

    public String getFacilityServiceBedNumber() {
        return facilityServiceBedNumber;
    }

    public void setFacilityServiceBedNumber(String facilityServiceBedNumber) {
        this.facilityServiceBedNumber = facilityServiceBedNumber == null ? null : facilityServiceBedNumber.trim();
    }

    public String getFacilityServiceWifi() {
        return facilityServiceWifi;
    }

    public void setFacilityServiceWifi(String facilityServiceWifi) {
        this.facilityServiceWifi = facilityServiceWifi == null ? null : facilityServiceWifi.trim();
    }

    public String getFacilityServiceRoomService() {
        return facilityServiceRoomService;
    }

    public void setFacilityServiceRoomService(String facilityServiceRoomService) {
        this.facilityServiceRoomService = facilityServiceRoomService == null ? null : facilityServiceRoomService.trim();
    }

    public String getFacilityServiceBreakfast() {
        return facilityServiceBreakfast;
    }

    public void setFacilityServiceBreakfast(String facilityServiceBreakfast) {
        this.facilityServiceBreakfast = facilityServiceBreakfast == null ? null : facilityServiceBreakfast.trim();
    }

    public String getFacilityServiceLaundry() {
        return facilityServiceLaundry;
    }

    public void setFacilityServiceLaundry(String facilityServiceLaundry) {
        this.facilityServiceLaundry = facilityServiceLaundry == null ? null : facilityServiceLaundry.trim();
    }

    public String getFacilityServiceTransferService() {
        return facilityServiceTransferService;
    }

    public void setFacilityServiceTransferService(String facilityServiceTransferService) {
        this.facilityServiceTransferService = facilityServiceTransferService == null ? null : facilityServiceTransferService.trim();
    }

	@Override
	public String toString() {
		return "FacilityService [facilityServiceId=" + facilityServiceId + ", facilityServiceBedType="
				+ facilityServiceBedType + ", facilityServiceBedNumber=" + facilityServiceBedNumber
				+ ", facilityServiceWifi=" + facilityServiceWifi + ", facilityServiceRoomService="
				+ facilityServiceRoomService + ", facilityServiceBreakfast=" + facilityServiceBreakfast
				+ ", facilityServiceLaundry=" + facilityServiceLaundry + ", facilityServiceTransferService="
				+ facilityServiceTransferService + "]";
	}
    
}