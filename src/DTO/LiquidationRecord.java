package DTO;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class LiquidationRecord {
    private String ID;          //PK
    private Date recordDate;
    private String librarianID; //FK
    private long totalQuanlity;

    public LiquidationRecord() {
    }

    public LiquidationRecord(String ID, Date recordDate, String librarianID) {
        this.ID = ID;
        this.recordDate = recordDate;
        this.librarianID = librarianID;
    }

    public LiquidationRecord(String ID, Date recordDate, String librarianID, long totalQuanlity) {
        this.ID = ID;
        this.recordDate = recordDate;
        this.librarianID = librarianID;
        this.totalQuanlity = totalQuanlity;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    public long getTotalQuanlity() {
        return totalQuanlity;
    }

    public void setTotalQuanlity(long totalQuanlity) {
        this.totalQuanlity = totalQuanlity;
    }

}
