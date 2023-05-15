package main.java.com.library.DAL;

import java.sql.Date;
import java.util.Vector;
import main.java.com.library.DTO.LoanDetail;
import main.java.com.library.DTO.LoanSlip;

/**
 *
 * @author ant1006
 */
public class LoanSlipDAO extends ConnectDB {

// -----------------------------------------------------------------------------
//    insert			
    public boolean insert(LoanSlip e) {
        int rs = executeUpdate("INSERT INTO LOAN_SLIP(reader_id,borrow_date,appointment_date,borrow_quantity,librarian_id) VALUES ("
                + e.getReaderID() + ","
                + "'" + e.getBorrowDate() + "',"
                + "'" + e.getAppointmentDate() + "',"
                + e.getBorrowQuantity() + ","
                + e.getLibrarianID() + ")");
        if (rs > 0) {
            int id = getByDTO(e).getID();
            Vector<LoanDetail> dts = e.getDetails();
            for (LoanDetail dt : dts) {
                rs += executeUpdate("INSERT INTO LOAN_DOCUMENT(ls_id,dcm_code,appointment_date,adjourned_logic) VALUES ("
                        + id + ","
                        + "'" + dt.getDcmCode() + "',"
                        + "'" + e.getAppointmentDate() + "',"
                        + 0 + ")");
            }
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
//    deny update
//
// -----------------------------------------------------------------------------
//    delete
    public boolean delete(int id) {
        int rs = executeUpdate("DELETE FROM LOAN_DOCUMENT WHERE ls_id=" + id);
        rs += executeUpdate("DELETE FROM LOAN_SLIP WHERE ls_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------
//    get one    
    public LoanSlip getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LOAN_SLIP WHERE ls_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public LoanSlip getByDTO(LoanSlip e) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LOAN_SLIP WHERE "
                + "reader_id=" + e.getReaderID() + " AND "
                + "borrow_date='" + e.getBorrowDate() + "' AND "
                + "appointment_date='" + e.getAppointmentDate() + "' AND "
                + "borrow_quantity=" + e.getBorrowQuantity() + " AND "
                + "librarian_id=" + e.getLibrarianID());
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.lastElement();
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
//    get many    
    public Vector<LoanSlip> getAll() {
        Vector<LoanSlip> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LOAN_SLIP");
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
    private LoanSlip getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        String code = (String) row.get(1);
        int readerID = (int) row.get(2);
        Date borrowDate = (Date) row.get(3);
        Date appointmentDate = (Date) row.get(4);
        int borrowQuantity = (int) row.get(5);
        int returnQuantity = (int) row.get(6);
        int librarianID = (int) row.get(7);
        LoanSlip element = new LoanSlip(id, code, readerID, borrowDate, appointmentDate, borrowQuantity, returnQuantity, librarianID);
        element.setDetails(getDetails(id));

        return element;
    }

    private Vector<LoanDetail> getDetails(int lsID) {
        Vector<LoanDetail> details = new Vector<>();
        Vector<Vector<Object>> tb = executeQuery("SELECT dcm_code, return_date FROM LOAN_DOCUMENT WHERE ls_id=" + lsID);
        for (int i = 0; i < tb.size(); i++) {
            // lay dong du lieu
            Vector<Object> row = tb.get(i);
            // Convert sang DTO details va add vao vector
            String code = (String) row.get(0);
            String title = new DocumentDAO().getByCode(code).getTitle();
            boolean returned = row.get(1) != null;
            details.add(new LoanDetail(code, title, returned));
        }
        return details;
    }
}
