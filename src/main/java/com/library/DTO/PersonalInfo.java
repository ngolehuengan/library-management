package main.java.com.library.DTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalInfo {
    private String citizenID; //CCCD
    private String fullName;
    private LocalDate birthday;
    private boolean isMale; // male
    private String phoneNumber;
    private String address;
    private String email;

    public PersonalInfo() {
        
    }
    public PersonalInfo(String citizenID, String fullName, String Birthday, String male, String phoneNumber, String Address,String email){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday = LocalDate.parse(Birthday, formatter);
        setPersonalinfo(citizenID, fullName, birthday, Boolean.getBoolean(male), phoneNumber, Address, email);
    }

    public void setPersonalinfo(String citizenID, String fullName, LocalDate birthday, boolean male, String phoneNumber, String address,String email) {
        this.citizenID = citizenID;
        this.fullName = fullName;
        this.birthday = birthday;
        this.isMale = isMale;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
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
    public LocalDate getDate(){
        return this.birthday;
    }
    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birthday = this.birthday.format(formatter);
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
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

    public boolean getisMale() {
        return isMale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
