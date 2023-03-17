package DTO;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class ImportRecord {
    private String ID;          //PK
    private Date recordDate;
    private String librarianID; //FK
    private double totalPrice;

    public ImportRecord() {
    }

    public ImportRecord(String ID, Date recordDate, String librarianID) {
        this.ID = ID;
        this.recordDate = recordDate;
        this.librarianID = librarianID;
    }
    
    public ImportRecord(String ID, Date recordDate, String librarianID, double totalPrice) {
        this.ID = ID;
        this.recordDate = recordDate;
        this.librarianID = librarianID;
        this.totalPrice = totalPrice;
    }

    public String getID() {
        return ID;
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

    public double getTotalPrice() {
        return totalPrice;
    }

}
