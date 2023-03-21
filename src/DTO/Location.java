package DTO;

/**
 * 
 * @author ant1006
 */
public class Location {
    private String ID;
    private String name;
    private int capacity; //sức chứa ? quyển
    // thêm thuộc tính hình ảnh hay sao đó
    private boolean exists = true;       //đang hiện hữu

    public Location() {
    }

    public Location(String ID, String name, int capacity) {
        this.ID = ID;
        this.name = name;
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Location{" + "ID=" + ID + ", name=" + name + ", capacity=" + capacity + '}';
    }
}
