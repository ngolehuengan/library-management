package main.java.com.library.DAL;

import java.sql.Date;
import java.util.Vector;
import main.java.com.library.DTO.Receipt;

/**
 *
 * @author ant1006
 */
public class ReceiptDAO extends ConnectDB {
    
// -----------------------------------------------------------------------------
//    insert																							    
    public boolean insert(Receipt e) {
        int rs = executeUpdate("INSERT INTO RECEIPT(receipt_date,reader_id,proceeds,librarian_id) VALUES ("
                + "'" + e.getDate() + "',"
                + e.getReaderID() + ","
                + e.getProceeds() + ","
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
        int rs = executeUpdate("DELETE FROM RECEIPT WHERE receipt_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------
//    get one    
    public Receipt getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM RECEIPT WHERE receipt_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
//    get many    
    public Vector<Receipt> getAll() {
        Vector<Receipt> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM RECEIPT");
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
    private Receipt getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        Date date = (Date) row.get(1);
        String code = (String) row.get(2);
        int readerID = (int) row.get(3);
        double proceeds = (double)row.get(4);
        int librarianID = (int) row.get(5);
        Receipt element = new Receipt(id, date, code, readerID, proceeds, librarianID);
        return element;
    }
}