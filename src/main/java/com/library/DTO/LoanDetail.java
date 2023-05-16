package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class LoanDetail {
    private String dcmCode;
    private String title;
    private boolean returned = false;
    
    public LoanDetail(String dcmCode, String title, boolean returned) {
        this.dcmCode = dcmCode;
        this.title = title;
        this.returned = returned;
    }
    
    public LoanDetail(String dcmCode, String title) {
        this.dcmCode = dcmCode;
        this.title = title;
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

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
}
