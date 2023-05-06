package main.java.com.library.DTO;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class ImportRecord {
    
    private int ID;          
    private Date date;
    private String code;
    private double totalPrice = 0;
    private int totalQuantity = 0;    
    private Librarian librarian; 
    private Vector<IPDetail> details = new Vector<>();
    
    private class IPDetail {
        private int ID;
        private Document document;
        private double price;
        private int quantity;

        public IPDetail(int ID, Document document, double price, int quantity) {
            this.ID = ID;
            this.document = document;
            this.price = price;
            this.quantity = quantity;
        }

        public IPDetail(Document document, double price, int quantity) {
            this.document = document;
            this.price = price;
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

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        
    }
    
    public ImportRecord(int ID, Date date, String code, double totalPrice, int totalQuantity, Librarian librarian, Vector<IPDetail> details) {
        this.ID = ID;
        this.date = date;
        this.code = code;
        this.totalPrice = totalPrice;
        this.totalQuantity = totalQuantity;
        this.librarian = librarian;
        this.details = details;
    }

    public ImportRecord(Date date, Librarian librarian) {
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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

    public Vector<IPDetail> getDetails() {
        return details;
    }

    public void setDetails(Vector<IPDetail> details) {
        this.details = details;
    }
}
