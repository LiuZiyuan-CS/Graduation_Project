package com.deluxHotel.DeluxHotelMS.bean;

import java.util.Date;

public class Reserve {
    private Integer reserveId;

    private Integer userId;

    private String reservePayment;

    private String reservePaymentStatus;

    private String reserveAdult;

    private String reserveChild;

    private Integer roomTypeId;

    private String reserveRoomNumber;

    private Date reserveCheckInTime;

    private Date reserveCheckOutTime;

    private String reserveStatus;

    public Integer getReserveId() {
        return reserveId;
    }

    public void setReserveId(Integer reserveId) {
        this.reserveId = reserveId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReservePayment() {
        return reservePayment;
    }

    public void setReservePayment(String reservePayment) {
        this.reservePayment = reservePayment == null ? null : reservePayment.trim();
    }

    public String getReservePaymentStatus() {
        return reservePaymentStatus;
    }

    public void setReservePaymentStatus(String reservePaymentStatus) {
        this.reservePaymentStatus = reservePaymentStatus == null ? null : reservePaymentStatus.trim();
    }

    public String getReserveAdult() {
        return reserveAdult;
    }

    public void setReserveAdult(String reserveAdult) {
        this.reserveAdult = reserveAdult == null ? null : reserveAdult.trim();
    }

    public String getReserveChild() {
        return reserveChild;
    }

    public void setReserveChild(String reserveChild) {
        this.reserveChild = reserveChild == null ? null : reserveChild.trim();
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getReserveRoomNumber() {
        return reserveRoomNumber;
    }

    public void setReserveRoomNumber(String reserveRoomNumber) {
        this.reserveRoomNumber = reserveRoomNumber == null ? null : reserveRoomNumber.trim();
    }

    public Date getReserveCheckInTime() {
        return reserveCheckInTime;
    }

    public void setReserveCheckInTime(Date reserveCheckInTime) {
        this.reserveCheckInTime = reserveCheckInTime;
    }

    public Date getReserveCheckOutTime() {
        return reserveCheckOutTime;
    }

    public void setReserveCheckOutTime(Date reserveCheckOutTime) {
        this.reserveCheckOutTime = reserveCheckOutTime;
    }

    public String getReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus == null ? null : reserveStatus.trim();
    }
}