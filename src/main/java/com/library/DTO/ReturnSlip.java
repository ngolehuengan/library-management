package main.java.com.library.DTO;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class ReturnSlip {

    private Date date;
    private int readerID;
    private double fine = 0;
    private double debt;
    private double total;
    private int librarianID;
    private Vector<ReturnDetail> details = new Vector<>();

    public ReturnSlip(Date date, int readerID, double debt, int librarianID) {
        this.date = date;
        this.readerID = readerID;
        this.debt = debt;
        this.total = fine + debt;
        this.librarianID = librarianID;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public double getTotal() {
        this.total = fine + debt;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }

    public Vector<ReturnDetail> getDetails() {
        return details;
    }

    public void setDetails(Vector<ReturnDetail> details) {
        this.details = details;
        for (ReturnDetail dt : details)
            this.fine += dt.getFine();
        this.total = fine + debt;
    }    

    public void addDetail(ReturnDetail detail) {
        this.details.add(detail);
        this.fine += detail.getFine();
        this.total = fine + debt;
    }    
}
