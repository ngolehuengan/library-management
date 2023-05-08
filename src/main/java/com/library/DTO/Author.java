package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class Author {
    private int ID;
    private String name;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" + "ID=" + ID + ", Name=" + name + '}';
    }
}
