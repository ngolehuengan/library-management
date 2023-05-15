package main.java.com.library.DAL;

import java.sql.Date;
import java.util.Vector;
import main.java.com.library.DTO.ReleaseRecord;
import main.java.com.library.DTO.RLDetail;

/**
 *
 * @author ant1006
 */
public class ReleaseRecordDAO extends ConnectDB {
    
// -----------------------------------------------------------------------------
//    insert																							    
    public boolean insert(ReleaseRecord e) {
        int rs = executeUpdate("INSERT INTO RELEASE_RECORD(rrc_date,total_quantity,librarian_id) VALUES ("
                + "'" + e.getDate() + "',"
                + e.getTotalQuantity() + ","
                + e.getLibrarianID() + ")");
        if (rs > 0) {
            int id = getByDTO(e).getID();
            Vector<RLDetail> dts = e.getDetails();
            for (int i = 0; i < dts.size(); i++) {
                RLDetail dt = dts.get(i);
                rs += executeUpdate("INSERT INTO RELEASE_DETAIL VALUES (" + id + ",'"
                        + dt.getDcmCode() + "',"
                        + dt.getQuantity() + ")");
            }
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
//    deny update
    

// -----------------------------------------------------------------------------
//    delete
    public boolean delete(int id) {
        int rs = executeUpdate("DELETE FROM RELEASE_DETAIL WHERE rrc_id=" + id);
        rs += executeUpdate("DELETE FROM RELEASE_RECORD WHERE rrc_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------
//    get one    
    public ReleaseRecord getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM RELEASE_RECORD WHERE rrc_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public ReleaseRecord getByDTO(ReleaseRecord e) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM RELEASE_RECORD WHERE "
                + "rrc_date='" + e.getDate() + "' AND "
                + "total_quantity=" + e.getTotalQuantity() + " AND "
                + "librarian_id=" + e.getLibrarianID());
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.lastElement();
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
//    get many    
    public Vector<ReleaseRecord> getAll() {
        Vector<ReleaseRecord> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM RELEASE_RECORD");
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
    private ReleaseRecord getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        Date date = (Date) row.get(1);
        String code = (String) row.get(2);
        int totalQuantity = (int) row.get(3);
        int librarianID = (int) row.get(4);
        ReleaseRecord element = new ReleaseRecord(id, date, code, totalQuantity, librarianID, getDetails(id));
        return element;
    }

    private Vector<RLDetail> getDetails(int rrcID) {
        Vector<RLDetail> details = new Vector<>();
        Vector<Vector<Object>> tb = executeQuery("SELECT * FROM RELEASE_DETAIL WHERE rrc_id=" + rrcID);
        for (int i = 0; i < tb.size(); i++) {
            // lay dong du lieu
            Vector<Object> row = tb.get(i);
            // Convert sang DTO details va add vao vector
            String code = (String) row.get(1);
            String title = new DocumentDAO().getByCode(code).getTitle();
            int quantity = (int) row.get(2);
            details.add(new RLDetail(code, title, quantity));
        }
        return details;
    }
}
