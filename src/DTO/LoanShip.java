package DTO;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class LoanShip {
    private String ID;          //PK
    private Date loanDate;
    private String librarianID; //FK
    private String readerID;    //FK
    
    public LoanShip() {
    }

    public LoanShip(String ID, Date loanDate, String librarianID, String readerID) {
        this.ID = ID;
        this.loanDate = loanDate;
        this.librarianID = librarianID;
        this.readerID = readerID;
    }
    
}
