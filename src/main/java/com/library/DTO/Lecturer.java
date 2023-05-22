package main.java.com.library.DTO;

import java.util.ArrayList;
import java.util.Date;

public class Lecturer {
    private String lecturerID; //ma giang vien
    private String departmentName; //khoa

 

    public Lecturer(String lecturerID, String departmentName){
        this.lecturerID = lecturerID;
        this.departmentName = departmentName;
    }
    public Lecturer(){
    }
    public String getLecturerID() {
        return lecturerID;
    }
    public void setLecturerID(String lecturerID) {
        this.lecturerID = lecturerID;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
}
