package DTO;

/**
 *
 * @author ant1006
 */
public class LiquidationDetails {
    private String liReportID;  //PK
    private String bookID;      //PK

    public LiquidationDetails() {
    }

    public LiquidationDetails(String liReportID, String bookID) {
        this.liReportID = liReportID;
        this.bookID = bookID;
    }
}
