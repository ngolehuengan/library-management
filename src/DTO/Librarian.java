package DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class Librarian extends PersonalInfo {
    private String ID;         //ma thu thu
    private boolean exists = true;       //đang hiện hữu

    public Librarian() {
        super();
    }
    public Librarian(String ID, String citizenID, String fullName, Date birthday, boolean isMale, String phoneNumber, String address) {
        super(citizenID, fullName, birthday, isMale, phoneNumber, address);
        this.ID = ID;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
