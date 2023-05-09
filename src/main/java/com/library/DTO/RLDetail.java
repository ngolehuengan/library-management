package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class RLDetail {

    private Document document;
    private int quantity;

    public RLDetail(Document document, int quantity) {
        this.document = document;
        this.quantity = quantity;
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
