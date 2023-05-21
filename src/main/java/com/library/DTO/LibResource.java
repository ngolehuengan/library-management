package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class LibResource {
    private int ID = 0;
    private Document document;
    private double price;
    private int totalQuantity;
    private int availableQuantity;
    private boolean borrowable = true;

    public LibResource(Document document, double price, int totalQuantity) {
        this.document = document;
        this.price = price;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = totalQuantity;
    }

    public LibResource(int ID, Document document, double price, int totalQuantity, int availableQuantity, boolean borrowable) {
        this.ID = ID;
        this.document = document;
        this.price = price;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = availableQuantity;
        this.borrowable = borrowable;
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

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public boolean isBorrowable() {
        return borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }
}