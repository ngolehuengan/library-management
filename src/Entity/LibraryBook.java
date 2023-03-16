package Entity;

import java.util.List;

/**
 *
 * @author ant1006
 */
public class LibraryBook {
    private String ID; //ma sach dinh danh trong thu vien
    private String ISBN;
    private boolean displayable = true; //Can display on GUI
    private boolean rentable = true;    //Allowed to borrow
    private boolean available = true;   //Available in library, can be borrowed present

    public LibraryBook(String ID, String ISBN, boolean displayable, boolean rentable, boolean available) {
        this.ID = ID;
        this.ISBN = ISBN;
        this.displayable = displayable;
        this.rentable = rentable;
        this.available = available;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDisplayable() {
        return displayable;
    }

    public void setDisplayable(boolean displayable) {
        this.displayable = displayable;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
