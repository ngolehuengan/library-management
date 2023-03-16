package Entity;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class BorrowedBook {
    private String bookID;
    private int loanStatus; //hien trang sach luc muon
    private boolean hadReturned = false; // tra chua ?
    
    private Date returnDate = null;
    private String librarianID; //ma thu thu tiep nhan
    private int returnStatus; //hien trang sach tra

    public BorrowedBook(String bookID, int loanStatus) {
        this.bookID = bookID;
        this.loanStatus = loanStatus;
    }

    public BorrowedBook(String bookID, int loanStatus, boolean hadReturned, Date returnDate, String librarianID, int returnStatus) {
        this.bookID = bookID;
        this.loanStatus = loanStatus;
        this.hadReturned = hadReturned;
        this.returnDate = returnDate;
        this.librarianID = librarianID;
        this.returnStatus = returnStatus;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public int getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(int loanStatus) {
        this.loanStatus = loanStatus;
    }

    public boolean isHadReturned() {
        return hadReturned;
    }

    public void setHadReturned(boolean hadReturned) {
        this.hadReturned = hadReturned;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    public int getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(int returnStatus) {
        this.returnStatus = returnStatus;
    }
}
