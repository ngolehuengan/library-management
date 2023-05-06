package DTO;

/**
 *
 * @author ant1006
 */
public class Category {
    private int ID;
    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }
    
    public Category(int ID, String name) {
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
        return "Category{" + "ID=" + ID + ", name=" + name + '}';
    }
}
