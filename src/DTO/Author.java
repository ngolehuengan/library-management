package DTO;

/**
 *
 * @author ant1006
 */
public class Author {
    private String ID;
    private String fullName;

    public Author() {
    }

    public Author(String ID, String fullName) {
        this.ID = ID;
        this.fullName = fullName;
    }

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

    @Override
    public String toString() {
        return "Author{" + "ID=" + ID + ", fullName=" + fullName + '}';
    }
}
