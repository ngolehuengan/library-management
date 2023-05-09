package main.java.com.library.DTO;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class LoanShip {																					
    private int ID;          
    private String code;
    private int readerID;
    private Date borrowDate;
    private Date appointmentDate;
    private int brQuantity = 0;
    private int returnQuantity = 0;
    private int librarianID;
    private Vector<LoanDetail> details = new Vector<>();
    
    private class LoanDetail {
        private Document document;
        private boolean returned;

        public LoanDetail(Document document, boolean returned) {
            this.document = document;
            this.returned = returned;
        }

        public Document getDocument() {
            return document;
        }

        public void setDocument(Document document) {
            this.document = document;
        }

        public boolean isReturned() {
            return returned;
        }

        public void setReturned(boolean returned) {
            this.returned = returned;
        }
    }

    public LoanShip(int ID, String code, int readerID, Date borrowDate, Date appointmentDate, int brQuantity, int returnQuantity, int librarianID) {
        this.ID = ID;
        this.code = code;
        this.readerID = readerID;
        this.borrowDate = borrowDate;
        this.appointmentDate = appointmentDate;
        this.brQuantity = brQuantity;
        this.returnQuantity = returnQuantity;
        this.librarianID = librarianID;
    }

    public LoanShip(int readerID, Date borrowDate, Date appointmentDate, int brQuantity, int librarianID) {
        this.readerID = readerID;
        this.borrowDate = borrowDate;
        this.appointmentDate = appointmentDate;
        this.brQuantity = brQuantity;
        this.librarianID = librarianID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getBrQuantity() {
        return brQuantity;
    }

    public void setBrQuantity(int brQuantity) {
        this.brQuantity = brQuantity;
    }

    public int getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(int returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }

    public Vector<LoanDetail> getDetails() {
        return details;
    }

    public void setDetails(Vector<LoanDetail> details) {
        this.details = details;
        this.brQuantity = details.size();
    }    

    public void addDetail(LoanDetail details) {
        this.details.add(details);
        this.brQuantity++;
    }    
}
