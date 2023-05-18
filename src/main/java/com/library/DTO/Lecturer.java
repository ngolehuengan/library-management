package main.java.com.library.DTO;

import java.util.ArrayList;
import java.util.Date;

public class Lecturer {
    private String lecturerID; //ma giang vien
    private String departmentName; //khoa

    public ArrayList setLecturer(String LecturerID, String departmentName) {
        ArrayList<Integer> wrongList = new ArrayList<Integer>();
        if(LecturerID.length() > 10 || LecturerID.isEmpty()) wrongList.add(1);
        if(departmentName.length() > 50) wrongList.add(3);
        if(wrongList.size() == 0){
            this.lecturerID = LecturerID;
            this.departmentName = departmentName;
        }
        return wrongList;
    }

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
