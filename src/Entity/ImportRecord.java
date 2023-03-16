package Entity;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ant1006
 */
public class ImportRecord {
    private String ID; 
    private Date recordDate;
    private String librarianID; //ma thu thu xu ly
    private List<Book> books = null;
    private double totalPrice;

    public ImportRecord(String ID, Date recordDate, String librarianID, List<Book> books, double totalPrice) {
        this.ID = ID;
        this.recordDate = recordDate;
        this.librarianID = librarianID;
        this.books = books;
        this.totalPrice = totalPrice;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
