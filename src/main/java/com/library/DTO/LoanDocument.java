package main.java.com.library.DTO;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class LoanDocument {
    
    private int ID;          
    private String loanCode;
    private Document document;
    private int readerID;
    private Date borrowDate;
    private Date appointmentDate;
    private Date returnDate = null;
    private double fine = 0;
    private boolean adjourned;
    private int librarianID;

    public LoanDocument(int ID, String loanCode, Document document, int readerID, Date borrowDate, Date appointmentDate, Date returnDate, double fine, boolean adjourned, int librarianID) {
        this.ID = ID;
        this.loanCode = loanCode;
        this.document = document;
        this.readerID = readerID;
        this.borrowDate = borrowDate;
        this.appointmentDate = appointmentDate;
        this.returnDate = returnDate;
        this.fine = fine;
        this.adjourned = adjourned;
        this.librarianID = librarianID;
    }

    public LoanDocument(int ID, String loanCode, Document document, int readerID, Date borrowDate, Date appointmentDate, boolean adjourned, int librarianID) {
        this.ID = ID;
        this.loanCode = loanCode;
        this.document = document;
        this.readerID = readerID;
        this.borrowDate = borrowDate;
        this.appointmentDate = appointmentDate;
        this.adjourned = adjourned;
        this.librarianID = librarianID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public boolean isAdjourned() {
        return adjourned;
    }

    public void setAdjourned(boolean adjourned) {
        this.adjourned = adjourned;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    } 
}
