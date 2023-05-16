package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class Publisher {
    private int ID = 0;
    private String name;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public Publisher(int ID, String name) {
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
        return "Publisher{" + "ID=" + ID + ", name=" + name + '}';
    }
}
