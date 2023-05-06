package main.java.com.library.DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class PenaltyRecord {
    
    private int ID;          //PK
    private Date recordDate;
    private String code;
    private Reader reader;   //FK
    private String content;  //noi dung vi pham
    private String solution; //huong xu ly
    private double fine;
    private Librarian librarian; 

    public PenaltyRecord(int ID, Date recordDate, String code, Reader reader, String content, String solution, double fine, Librarian librarian) {
        this.ID = ID;
        this.recordDate = recordDate;
        this.code = code;
        this.reader = reader;
        this.content = content;
        this.solution = solution;
        this.fine = fine;
        this.librarian = librarian;
    }
 
    public PenaltyRecord(Date recordDate, Reader reader, String content, String solution, double fine, Librarian librarian) {
        this.recordDate = recordDate;
        this.reader = reader;
        this.content = content;
        this.solution = solution;
        this.fine = fine;
        this.librarian = librarian;
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

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
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

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
}
