package main.java.com.library.DTO;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class ReleaseRecord {
    
    private int ID;          
    private Date date;
    private String code;
    private int totalQuantity = 0;    
    private Librarian librarian; 
    private Vector<RLDetail> details = new Vector<>();
    
    private class RLDetail {
        private int ID;
        private Document document;
        private int quantity;

        public RLDetail(int ID, Document document, int quantity) {
            this.ID = ID;
            this.document = document;
            this.quantity = quantity;
        }

        public RLDetail(Document document, int quantity) {
            this.document = document;
            this.quantity = quantity;
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

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        
    }
    
    public ReleaseRecord(int ID, Date date, String code, int totalQuantity, Librarian librarian, Vector<RLDetail> details) {
        this.ID = ID;
        this.date = date;
        this.code = code;
        this.totalQuantity = totalQuantity;
        this.librarian = librarian;
        this.details = details;
    }

    public ReleaseRecord(Date date, Librarian librarian) {
        this.date = date;
        this.librarian = librarian;
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

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public Vector<RLDetail> getDetails() {
        return details;
    }

    public void setDetails(Vector<RLDetail> details) {
        this.details = details;
    }
}
