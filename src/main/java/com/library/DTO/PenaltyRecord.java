package main.java.com.library.DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class PenaltyRecord {
    
    private int ID;          
    private Date date;
    private String code;
    private int readerID; 
    private String content;  
    private String solution; 
    private double fine;
    private int librarianID; 

    public PenaltyRecord(int ID, Date date, String code, int readerID, String content, String solution, double fine, int librarianID) {
        this.ID = ID;
        this.date = date;
        this.code = code;
        this.readerID = readerID;
        this.content = content;
        this.solution = solution;
        this.fine = fine;
        this.librarianID = librarianID;
    }
 
    public PenaltyRecord(Date date, int readerID, String content, String solution, double fine, int librarianID) {
        this.date = date;
        this.readerID = readerID;
        this.content = content;
        this.solution = solution;
        this.fine = fine;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }
}
