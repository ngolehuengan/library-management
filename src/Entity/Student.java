package Entity;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class Student extends PersonalInfo {
    private String studentID; //mssv
    private String classID;   //lop 
    private String departmentName; //khoa

    public Student(String studentID, String classID, String departmentName, String citizenID, String fullName, Date birthday, boolean isMale, String phoneNumber, String address) {
        super(citizenID, fullName, birthday, isMale, phoneNumber, address);
        this.studentID = studentID;
        this.classID = classID;
        this.departmentName = departmentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    } 
}
