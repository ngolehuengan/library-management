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
    public ArrayList setStudent(String studentID, String className, String departmentName) {
        ArrayList<Integer> wrongList = new ArrayList<Integer>();
        if(studentID.length() != 10 ||studentID ==  null) wrongList.add(1);
        if(className.length() >10 || className == null) wrongList.add(2);
        if(departmentName.length() > 50 ) wrongList.add(3);
        if(wrongList.size() == 0){
            this.studentID = studentID;
            this.className = className;
            this.departmentName = departmentName;
        }
        return wrongList;
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
