package Entity;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class Librarian extends PersonalInfo {
    private String ID;         //ma thu thu

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
