package Entity;

/**
 *
 * @author ant1006
 */
public class Author {
    private String ID, fullName;

    public Author(String ID, String fullName) {
        this.ID = ID;
        this.fullName = fullName;
    }
//------------------------------------------------------------------------------
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
