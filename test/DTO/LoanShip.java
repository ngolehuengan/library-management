package DTO;

import main.java.com.library.DTO.Document;
import main.java.com.library.DTO.Reader;
import main.java.com.library.DTO.Librarian;
import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class LoanShip {
    
    private int ID;          
    private String code;
    private Reader reader;
    private Date borrowDate;
    private Date appointmentDate;
    private int brQuantity;
    private int returnQuantity;
    private Librarian librarian;
    private Vector<LoanDetail> details = new Vector<>();
    
    private class LoanDetail {
        private int ID;
        private Document document;
        private boolean returned;

        public LoanDetail(int ID, Document document, boolean returned) {
            this.ID = ID;
            this.document = document;
            this.returned = returned;
        }

        public LoanDetail(Document document, boolean returned) {
            this.document = document;
            this.returned = returned;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
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

    public LoanShip(int ID, String code, Reader reader, Date borrowDate, Date appointmentDate, int brQuantity, int returnQuantity, Librarian librarian) {
        this.ID = ID;
        this.code = code;
        this.reader = reader;
        this.borrowDate = borrowDate;
        this.appointmentDate = appointmentDate;
        this.brQuantity = brQuantity;
        this.returnQuantity = returnQuantity;
        this.librarian = librarian;
    }

    public LoanShip(Reader reader, Date borrowDate, Date appointmentDate, int brQuantity, Librarian librarian) {
        this.reader = reader;
        this.borrowDate = borrowDate;
        this.appointmentDate = appointmentDate;
        this.brQuantity = brQuantity;
        this.librarian = librarian;
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

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public Vector<LoanDetail> getDetails() {
        return details;
    }

    public void setDetails(Vector<LoanDetail> details) {
        this.details = details;
    }        
}
