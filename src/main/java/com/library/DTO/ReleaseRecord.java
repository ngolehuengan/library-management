package main.java.com.library.DTO;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class ReleaseRecord {
    
    private int ID;          
    private Date date;
    private String code;
    private int totalQuantity = 0;    
    private int librarianID; 
    private Vector<RLDetail> details = new Vector<>();

    public ReleaseRecord() {
    }
    
    public ReleaseRecord(int ID, Date date, String code, int totalQuantity, int librarianID, Vector<RLDetail> details) {
        this.ID = ID;
        this.date = date;
        this.code = code;
        this.totalQuantity = totalQuantity;
        this.librarianID = librarianID;
        this.details = details;
    }

    public ReleaseRecord(Date date, int librarianID) {
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

    public Vector<RLDetail> getDetails() {
        return details;
    }

    public void setDetails(Vector<RLDetail> details) {
        this.details = details;
        int quantity = 0;
        for (RLDetail dt : details) {
            quantity += dt.getQuantity();
        }
        this.totalQuantity = quantity;
    }
    
    public void addDetail(RLDetail e) {
        details.add(e);
        totalQuantity += e.getQuantity();
    }
    
    public void removeDetail(RLDetail e) {
        details.remove(e);
        totalQuantity += e.getQuantity();
    }
}
