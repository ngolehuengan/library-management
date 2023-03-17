package DTO;

/**
 *
 * @author ant1006
 */
public class Publisher {
    private String ID;
    private String name;

    public Publisher() {
    }

    public Publisher(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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
