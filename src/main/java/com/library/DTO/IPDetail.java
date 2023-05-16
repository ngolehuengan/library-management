package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class IPDetail {

    private String dcmCode;
    private String title;
    private double price;
    private int quantity;

    public IPDetail(String dcmCode, double price, int quantity) {
        this.dcmCode = dcmCode;
        this.price = price;
        this.quantity = quantity;
    }

    public IPDetail(String dcmCode, String title, double price, int quantity) {
        this.dcmCode = dcmCode;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }
    
    public IPDetail(Document document, double price, int quantity) {
        this.dcmCode = document.getCode();
        this.title = document.getTitle();
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getDcmCode() {
        return dcmCode;
    }

    public void setDcmCode(String dcmCode) {
        this.dcmCode = dcmCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
