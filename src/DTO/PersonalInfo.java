package DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
abstract class PersonalInfo {

    private String citizenID; //CCCD
    private String fullName;
    private Date birthday;
    private boolean isMale;
    private String phoneNumber;
    private String address;
    // ảnh ??

    public PersonalInfo() {
    }

    public PersonalInfo(String citizenID, String fullName, Date birthday, boolean isMale, String phoneNumber, String address) {
        this.citizenID = citizenID;
        this.fullName = fullName;
        this.birthday = birthday;
        this.isMale = isMale;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" + "citizenID=" + citizenID + ", fullName=" + fullName + ", birthday=" + birthday + ", Sex=" + (isMale ? "Male" : "Female") + ", phoneNumber=" + phoneNumber + ", address=" + address + '}';
    }

}
