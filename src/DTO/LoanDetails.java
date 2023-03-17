package DTO;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class LoanDetails {
    private String loanShipID;  //PK
    private String bookID;      //PK    
    private int loanStatus; //hien trang sach luc muon
    
    private boolean hadReturned; // tra chua ?
    
    private Date returnDate;
    private String librarianID; //ma thu thu tiep nhan
    private int returnStatus; //hien trang sach tra

    public LoanDetails() {
    }

    public LoanDetails(String loanShipID, String bookID, int loanStatus) {
        this.loanShipID = loanShipID;
        this.bookID = bookID;
        this.loanStatus = loanStatus;
        this.hadReturned = false;
    }

    public LoanDetails(String loanShipID, String bookID, int loanStatus, boolean hadReturned, Date returnDate, String librarianID, int returnStatus) {
        this.loanShipID = loanShipID;
        this.bookID = bookID;
        this.loanStatus = loanStatus;
        this.hadReturned = hadReturned;
        this.returnDate = returnDate;
        this.librarianID = librarianID;
        this.returnStatus = returnStatus;
    }
}
