package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class IPDetail {

    private Document document;
    private double price;
    private int quantity;

    public IPDetail(Document document, double price, int quantity) {
        this.document = document;
        this.price = price;
        this.quantity = quantity;
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
