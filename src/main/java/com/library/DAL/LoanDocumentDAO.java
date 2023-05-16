package main.java.com.library.DAL;

import java.sql.Date;
import java.util.Vector;
import main.java.com.library.DTO.Document;
import main.java.com.library.DTO.LoanDocument;
import main.java.com.library.DTO.LoanSlip;

/**
 *
 * @author ant1006
 */
public class LoanDocumentDAO extends ConnectDB {
    
// -----------------------------------------------------------------------------
//    insert (in LoanSlipDAO)																							    
//
// -----------------------------------------------------------------------------    
//    update
    public boolean updateAppointmentDate(int ID, Date newData) {
        int rs = executeUpdate("UPDATE LOAN_DOCUMENT SET appointment_date='" + newData + "' WHERE ld_id=" + ID);
        if (rs > 0) {
            executeUpdate("UPDATE LOAN_DOCUMENT SET adjourned_logic=1 WHERE ld_id=" + ID);
            return true;
        }
        return false;
    }

    public boolean updateReturnDate(int ID, Date newData) {
        int rs = executeUpdate("UPDATE LOAN_DOCUMENT SET return_date='" + newData + "' WHERE ld_id=" + ID);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
    public boolean updateFine(int ID, double newData) {
        int rs = executeUpdate("UPDATE LOAN_DOCUMENT SET fine=" + newData + " WHERE ld_id=" + ID);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
    public boolean updateLibrarianID(int ID, int newData) {
        int rs = executeUpdate("UPDATE LOAN_DOCUMENT SET librarian_id=" + newData + " WHERE ld_id=" + ID);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
// -----------------------------------------------------------------------------
//    delete (in LoanSlipDAO)	
//
// -----------------------------------------------------------------------------
//    get one    
    public LoanDocument get(int ID) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LOAN_DOCUMENT WHERE ld_id=" + ID);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
//    get many    
    public Vector<LoanDocument> getAll() {
        Vector<LoanDocument> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LOAN_SLIP");
        for (int i = 0; i < table.size(); i++) {
            // Lay ra dong du lieu
            Vector<Object> row = table.get(i);
            // Convert sang DTO va add vao vector
            vt.add(getDTO(row));
        }
        return vt;
    }
    
    public Vector<LoanDocument> getBorrowing() {
        Vector<LoanDocument> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LOAN_DOCUMENT WHERE return_date IS NULL");
        for (int i = 0; i < table.size(); i++) {
            // Lay ra dong du lieu
            Vector<Object> row = table.get(i);
            // Convert sang DTO va add vao vector
            vt.add(getDTO(row));
        }
        return vt;
    }
    

// -----------------------------------------------------------------------------
//    private method function    			
    private LoanDocument getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        int lsID = (int) row.get(1);
        LoanSlip ls = new LoanSlipDAO().getByID(lsID);
        String loanCode = ls.getCode();
        String dcmCode = (String) row.get(2);
        Document dcm = new DocumentDAO().getByCode(dcmCode);
        int readerID = ls.getReaderID();
        Date borrowDate = ls.getBorrowDate();
        Date appointmentDate = (Date) row.get(3);
        Date returnDate = (Date) row.get(4);
        double fine = (double) row.get(5);
        boolean adjourned = (boolean) row.get(6);
        int librarianID = (int) row.get(7);
        LoanDocument element = new LoanDocument(id, loanCode, dcm, readerID, borrowDate, appointmentDate, returnDate, fine, adjourned, librarianID);

        return element;
    }
}
