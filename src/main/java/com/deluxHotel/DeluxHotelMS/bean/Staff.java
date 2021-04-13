package com.deluxHotel.DeluxHotelMS.bean;

public class Staff {
    private Integer staffId;

    private String staffName;

    private String staffSex;

    private String staffIdcard;

    private String staffTelephone;

    private String staffEmail;

    private String staffPassword;

    private String staffProfile;

    private String staffAuthority;

    @Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffSex=" + staffSex + ", staffIdcard="
				+ staffIdcard + ", staffTelephone=" + staffTelephone + ", staffEmail=" + staffEmail + ", staffPassword="
				+ staffPassword + ", staffProfile=" + staffProfile + ", staffAuthority=" + staffAuthority + "]";
	}

	public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffIdcard() {
        return staffIdcard;
    }

    public void setStaffIdcard(String staffIdcard) {
        this.staffIdcard = staffIdcard == null ? null : staffIdcard.trim();
    }

    public String getStaffTelephone() {
        return staffTelephone;
    }

    public void setStaffTelephone(String staffTelephone) {
        this.staffTelephone = staffTelephone == null ? null : staffTelephone.trim();
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail == null ? null : staffEmail.trim();
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword == null ? null : staffPassword.trim();
    }

    public String getStaffProfile() {
        return staffProfile;
    }

    public void setStaffProfile(String staffProfile) {
        this.staffProfile = staffProfile == null ? null : staffProfile.trim();
    }

    public String getStaffAuthority() {
        return staffAuthority;
    }

    public void setStaffAuthority(String staffAuthority) {
        this.staffAuthority = staffAuthority == null ? null : staffAuthority.trim();
    }
}