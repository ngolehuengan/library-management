package main.java.com.library.DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class Receipt {
    
    private int ID;          
    private Date date;
    private String code;
    private int readerID;
    private double proceeds;    
    private int librarianID; 

    public Receipt(int ID, Date date, String code, int readerID, double proceeds, int librarianID) {
        this.ID = ID;
        this.date = date;
        this.code = code;
        this.readerID = readerID;
        this.proceeds = proceeds;
        this.librarianID = librarianID;
    }

    public Receipt(Date date, int readerID, double proceeds, int librarianID) {
        this.date = date;
        this.readerID = readerID;
        this.proceeds = proceeds;
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

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public double getProceeds() {
        return proceeds;
    }

    public void setProceeds(double proceeds) {
        this.proceeds = proceeds;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }
}
