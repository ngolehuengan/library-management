package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class Account {
    private String username; //PK
    private String password;
    private int role; //cap 1 cap 2 cap 3
    // private String personalID; //mã thủ thư (cấp 2 3) hoặc mã độc giả (1)

    public Account(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;
        // this.personalID = personalID;
    }

    
    public Account() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    // public String getPersonalID() {
    //     return personalID;
    // }

    // public void setPersonalID(String personalID) {
    //     this.personalID = personalID;
    // }
}
