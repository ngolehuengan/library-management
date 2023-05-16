package main.java.com.library.DAL;

import java.sql.Date;
import java.util.Vector;
import main.java.com.library.DTO.PenaltyRecord;

/**
 *
 * @author ant1006
 */
public class PenaltyRecordDAO extends ConnectDB {
    
// -----------------------------------------------------------------------------
//    insert																							    
    public boolean insert(PenaltyRecord e) {
        int rs = executeUpdate("INSERT INTO PENALTY_RECORD(prc_date,reader_id,content,solution,fine,librarian_id) VALUES ("
                + "'" + e.getDate() + "',"
                + e.getReaderID() + ","
                + "'" + e.getContent() + "',"
                + "'" + e.getSolution() + "',"
                + e.getFine() + ","
                + e.getLibrarianID() + ")");
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
//    deny update
    

// -----------------------------------------------------------------------------
//    delete
    public boolean delete(int id) {
        int rs = executeUpdate("DELETE FROM PENALTY_RECORD WHERE prc_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------
//    get one    
    public PenaltyRecord getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM PENALTY_RECORD WHERE prc_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
//    get many    
    public Vector<PenaltyRecord> getAll() {
        Vector<PenaltyRecord> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM PENALTY_RECORD");
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
    private PenaltyRecord getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        Date date = (Date) row.get(1);
        String code = (String) row.get(2);
        int readerID = (int) row.get(3);
        String content = (String)row.get(4);
        String solution = (String)row.get(5);
        double fine = (double) row.get(6);
        int librarianID = (int) row.get(7);
        PenaltyRecord element = new PenaltyRecord(id, date, code, readerID, content, solution, fine, librarianID);
        return element;
    }
}