package main.java.com.library.DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class Student extends PersonalInfo {
    private String studentID; // mssv
    private String classID; // lop
    private String departmentName; // khoa

    public Student() {
        super();
    }

    public Student(String studentID, String classID, String departmentName, String citizenID, String fullName,
            Date birthday, boolean isMale, String phoneNumber, String address) {
        super(citizenID, fullName, birthday, isMale, phoneNumber, address);
        this.studentID = studentID;
        this.classID = classID;
        this.departmentName = departmentName;
    }

}
