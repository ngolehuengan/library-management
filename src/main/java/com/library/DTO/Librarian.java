package main.java.com.library.DTO;


/**
 *
 * @author ant1006
 */
public class Librarian {
    private String ID;         //ma thu thu
    private String userName;
    public Librarian() {

    }

    public Librarian(String iD, String userName) {
        ID = iD;
        this.userName = userName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
