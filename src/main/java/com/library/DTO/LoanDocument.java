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
    private String notes;
    private Reader reader;
    private Date borrowDate;
    private Date appointmentDate;
    private Date returnDate;
    private double fine;
    private Librarian librarian;

    public LoanDocument(int ID, String loanCode, Document document, String notes, Reader reader, Date borrowDate, Date appointmentDate, Date returnDate, double fine, Librarian librarian) {
        this.ID = ID;
        this.loanCode = loanCode;
        this.document = document;
        this.notes = notes;
        this.reader = reader;
        this.borrowDate = borrowDate;
        this.appointmentDate = appointmentDate;
        this.returnDate = returnDate;
        this.fine = fine;
        this.librarian = librarian;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
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

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
            

}
