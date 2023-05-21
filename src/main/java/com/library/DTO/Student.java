package main.java.com.library.DTO;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author ant1006
 */
public class Student {
    private String studentID; //mssv
    private String className;   //lop 
    private String departmentName; //khoa
    public Student() {
        
    }
    

    public Student(String studentID, String className, String departmentName) {
        this.studentID = studentID;
        this.className = className;
        this.departmentName = departmentName;
    }


    public Student(String className, String departmentName) {
        this.className = className;
        this.departmentName = departmentName;
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
 
}
