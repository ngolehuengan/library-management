package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class ReturnDetail {
    
    private int loanDcmID;
    private String dcmCode;
    private String title;
    private int overdue = 0;
    private double fine = 0;

    public ReturnDetail(int loanDcmID, String dcmCode, String title, int overdue, double fine) {
        this.loanDcmID = loanDcmID;
        this.dcmCode = dcmCode;
        this.title = title;
        this.overdue = overdue;
        this.fine = fine;
    }

    public ReturnDetail(LoanDocument loanDcm) {
        this.loanDcmID = loanDcm.getID();
        this.dcmCode = loanDcm.getDocument().getCode();
        this.title = loanDcm.getDocument().getTitle();
    }

    public int getLoanDcmID() {
        return loanDcmID;
    }

    public void setLoanDcmID(int loanDcmID) {
        this.loanDcmID = loanDcmID;
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

    public int getOverdue() {
        return overdue;
    }

    public void setOverdue(int overdue) {
        this.overdue = overdue;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

}
