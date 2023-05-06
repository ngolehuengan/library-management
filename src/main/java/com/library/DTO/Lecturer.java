package main.java.com.library.DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class Lecturer extends PersonalInfo {
    private String lecturerID; // ma giang vien
    private String departmentName; // khoa

    public Lecturer() {
        super();
    }

    public Lecturer(String lecturerID, String departmentName, String citizenID, String fullName, Date birthday,
            boolean isMale, String phoneNumber, String address) {
        super(citizenID, fullName, birthday, isMale, phoneNumber, address);
        this.lecturerID = lecturerID;
        this.departmentName = departmentName;
    }

}
