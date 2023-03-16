package Entity;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class PenaltyRecord {
    private String ID; 
    private Date recordDate;
    private String librarianID; //ma thu thu tiep nhan
    private String readerID;
    private String content;  //noi dung vi pham
    private String solution; //huong xu ly

    public PenaltyRecord(String ID, Date recordDate, String librarianID, String readerID, String content, String solution) {
        this.ID = ID;
        this.recordDate = recordDate;
        this.librarianID = librarianID;
        this.readerID = readerID;
        this.content = content;
        this.solution = solution;
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

    public String getReaderID() {
        return readerID;
    }

    public void setReaderID(String readerID) {
        this.readerID = readerID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
