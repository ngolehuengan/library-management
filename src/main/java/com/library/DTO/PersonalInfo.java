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
    public PersonalInfo(String citizenID2, String name, String birthday2, String string, String phone, String address2,
            String email2) {
    }
    // 1 : Căn cước hoặc chứng minh nhân dân không hợp lệ
    private boolean checkCitizenID(String citizenID ){
        if (citizenID.length() != 12 && citizenID.length() != 9){
            return false;
        }
        // check parse
        try {
            Long.parseLong(citizenID);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    private boolean checkPhone(String Phone){
        if(Phone.length() != 10) return false;
        try {
            Integer.parseInt(Phone);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    private boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public ArrayList setPersonalInfo(String citizenID, String fullName, String Birthday, String male, String phoneNumber, String Address,String email){
        ArrayList<Integer> wrongFormat = new ArrayList<Integer>();
        if(citizenID.isEmpty() ||checkCitizenID(citizenID) == false) wrongFormat.add(1);
        if(fullName.isEmpty()|| fullName.length() >50) wrongFormat.add(2);
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.birthday = LocalDate.parse(Birthday, formatter);
            LocalDate currentDate = LocalDate.now();
            if(this.birthday.isAfter(currentDate)) wrongFormat.add(3);
        } catch (Exception e) {
            wrongFormat.add(3);
        }
        // 
        if(phoneNumber.isEmpty() || checkPhone(phoneNumber) == false) wrongFormat.add((4)) ;
        if (Address.isEmpty()||Address.length() > 100) wrongFormat.add(5);
        if (email.isEmpty()||checkEmail(email) == false) wrongFormat.add(6);
        if(wrongFormat.size() == 0 ){

            setPersonalinfo(citizenID,fullName,this.birthday,Boolean.getBoolean(male),phoneNumber,Address,email);
        }
        return wrongFormat;
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

    public LocalDate getBirthday() {
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

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
