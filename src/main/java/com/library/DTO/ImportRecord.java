package main.java.com.library.DTO;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class ImportRecord {
    
    private int ID;          
    private Date date;
    private String code;
    private double totalPrice = 0;
    private int totalQuantity = 0;    
    private int librarianID; 
    private Vector<IPDetail> details = new Vector<>();

    public ImportRecord() {
    }
    
    public ImportRecord(int ID, Date date, String code, double totalPrice, int totalQuantity, int librarianID) {
        this.ID = ID;
        this.date = date;
        this.code = code;
        this.totalPrice = totalPrice;
        this.totalQuantity = totalQuantity;
        this.librarianID = librarianID;
    }

    public ImportRecord(Date date, int librarianID) {
        this.date = date;
        this.librarianID = librarianID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }

    public Vector<IPDetail> getDetails() {
        return details;
    }

    public void setDetails(Vector<IPDetail> details) {
        this.details = details;
        double price = 0;
        int quantity = 0;
        for (IPDetail dt : details) {
            price += dt.getPrice()*dt.getQuantity();
            quantity += dt.getQuantity();
        }
        this.totalPrice = price;
        this.totalQuantity = quantity;
    }

    public void addDetail(IPDetail e) {
        details.add(e);
        totalPrice += e.getPrice()*e.getQuantity();
        totalQuantity += e.getQuantity();
    }
    
    public void removeDetail(IPDetail e) {
        details.remove(e);
        totalPrice -= e.getPrice()*e.getQuantity();
        totalQuantity -= e.getQuantity();
    }    
}
