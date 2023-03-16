package Entity;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class Reader extends Student {
    private String ID;             //ma doc gia
    private Date registrationDate; //thoi gian dang ky
    private int duration;          //thoi han

    public Reader(String ID, Date registrationDate, int duration, String studentID, String classID, String departmentName, String citizenID, String fullName, Date birthday, boolean isMale, String phoneNumber, String address) {
        super(studentID, classID, departmentName, citizenID, fullName, birthday, isMale, phoneNumber, address);
        this.ID = ID;
        this.registrationDate = registrationDate;
        this.duration = duration;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
