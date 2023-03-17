package DTO;

/**
 *
 * @author ant1006
 */
public class ImportDetails {
    private String imReportID;  //PK
    private String ISBN;        //PK
    private int quanlity;

    public ImportDetails() {
    }

    public ImportDetails(String imReportID, String ISBN, int quanlity) {
        this.imReportID = imReportID;
        this.ISBN = ISBN;
        this.quanlity = quanlity;
    }

    
    
    

}
