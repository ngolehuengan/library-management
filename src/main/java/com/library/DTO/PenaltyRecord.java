package main.java.com.library.DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class PenaltyRecord {
    
    private int ID;          
    private Date recordDate;
    private String code;
    private int readerID; 
    private String content;  
    private String solution; 
    private double fine;
    private int librarianID; 

    public PenaltyRecord(int ID, Date recordDate, String code, int readerID, String content, String solution, double fine, int librarianID) {
        this.ID = ID;
        this.recordDate = recordDate;
        this.code = code;
        this.readerID = readerID;
        this.content = content;
        this.solution = solution;
        this.fine = fine;
        this.librarianID = librarianID;
    }
 
    public PenaltyRecord(Date recordDate, int readerID, String content, String solution, double fine, int librarianID) {
        this.recordDate = recordDate;
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

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
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
