package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class RLDetail {
private String dcmCode;
    private String title;
    private int quantity;

    public RLDetail(String dcmCode, int quantity) {
        this.dcmCode = dcmCode;
        this.quantity = quantity;
    }

    public RLDetail(String dcmCode, String title, int quantity) {
        this.dcmCode = dcmCode;
        this.title = title;
        this.quantity = quantity;
    }
    
    public RLDetail(Document document, int quantity) {
        this.dcmCode = document.getCode();
        this.title = document.getTitle();
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
