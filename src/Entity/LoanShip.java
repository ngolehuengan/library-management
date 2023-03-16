package Entity;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ant1006
 */
public class LoanShip {
    private String ID; 
    private Date loanDate;
    private String librarianID; //ma thu thu tiep nhan
    private String readerID;
    private List<BorrowedBook> borrowedBooks = null;

    public LoanShip(String ID, Date loanDate, String librarianID, String readerID, List<BorrowedBook> borrowedBooks) {
        this.ID = ID;
        this.loanDate = loanDate;
        this.librarianID = librarianID;
        this.readerID = readerID;
        this.borrowedBooks = borrowedBooks;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    public String getReaderID() {
        return readerID;
    }

    public void setReaderID(String readerID) {
        this.readerID = readerID;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<BorrowedBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    
    
    
    
}
