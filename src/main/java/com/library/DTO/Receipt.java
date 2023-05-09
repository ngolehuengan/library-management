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
    private Reader reader;
    private double proceeds;    
    private int librarianID; 

    public Receipt(int ID, Date date, String code, Reader reader, double proceeds, int librarianID) {
        this.ID = ID;
        this.date = date;
        this.code = code;
        this.reader = reader;
        this.proceeds = proceeds;
        this.librarianID = librarianID;
    }

    public Receipt(Date date, Reader reader, double proceeds, int librarianID) {
        this.date = date;
        this.reader = reader;
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

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
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
