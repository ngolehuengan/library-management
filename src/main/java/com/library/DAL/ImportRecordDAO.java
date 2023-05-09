package main.java.com.library.DAL;

import java.sql.Date;
import java.util.Vector;
import main.java.com.library.DTO.Book;
import main.java.com.library.DTO.Document;
import main.java.com.library.DTO.ImportRecord;
import main.java.com.library.DTO.IPDetail;

/**
 *
 * @author ant1006
 */
public class ImportRecordDAO extends ConnectDB {
    
// -----------------------------------------------------------------------------
//    insert																							    
    public boolean insert(ImportRecord e) {
        int rs = executeUpdate("INSERT INTO IMPORT_RECORD(irc_date,total_price,total_quantity,librarian_id) VALUES ("
                + "'" + e.getDate() + "',"
                + e.getTotalPrice() + ","
                + e.getTotalQuantity() + ","
                + e.getLibrarianID() + ")");
        if (rs > 0) {
            int id = getByDTO(e).getID();
            Vector<IPDetail> dts = e.getDetails();
            for (int i = 0; i < dts.size(); i++) {
                IPDetail dt = dts.get(i);
                rs += executeUpdate("INSERT INTO IMPORT_DETAIL VALUES (" + id + ",'"
                        + dt.getDocument().getCode() + "',"
                        + dt.getPrice() + ","
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
        int rs = executeUpdate("DELETE FROM IMPORT_DETAIL WHERE irc_id=" + id);
        rs += executeUpdate("DELETE FROM IMPORT_RECORD WHERE irc_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------
//    get one    
    public ImportRecord getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM IMPORT_RECORD WHERE irc_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public ImportRecord getByDTO(ImportRecord e) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM IMPORT_RECORD WHERE "
                + "irc_date='" + e.getDate() + "' AND "
                + "total_price=" + e.getTotalPrice() + " AND "
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
    public Vector<ImportRecord> getAll() {
        Vector<ImportRecord> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM IMPORT_RECORD");
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
    private ImportRecord getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        Date date = (Date) row.get(1);
        String code = (String) row.get(2);
        double totalPrice = (double) row.get(3);
        int totalQuantity = (int) row.get(4);
        int librarianID = (int) row.get(5);
        ImportRecord element = new ImportRecord(id, date, code, totalPrice, totalQuantity, librarianID);
        element.setDetails(getDetails(id));

        return element;
    }

    private Vector<IPDetail> getDetails(int ircID) {
        Vector<IPDetail> details = new Vector<>();
        Vector<Vector<Object>> tb = executeQuery("SELECT * FROM IMPORT_DETAIL WHERE irc_id=" + ircID);
        for (int i = 0; i < tb.size(); i++) {
            // lay dong du lieu
            Vector<Object> row = tb.get(i);
            // Convert sang DTO details va add vao vector
            String code = (String) row.get(1);
            Document document = new DocumentDAO().getByCode(code);
            double price = (double) row.get(2);
            int quantity = (int) row.get(3);
            details.add(new IPDetail(document, price, quantity));
        }
        return details;
    }
    
// -----------------------------------------------------------------------------
    public static void main (String[] args) {
        Vector<Book> dcm = new BookDAO().getAll();
        ImportRecordDAO dao = new ImportRecordDAO();
//        
//        System.out.println(bus.delete(vt.get(1)));
        
//        Book e = vt.get(0);
//        Vector<Author> at = new Vector<>();
//        at.add(new Author("Tô Hoài"));
//        e.setAuthor(at);
//        
//        System.out.println(bus.edit(e.getID(),e));

        ImportRecord e = new ImportRecord();
        e.setDate(new Date(System.currentTimeMillis()));
        e.setLibrarianID(2);
        e.addDetail(new IPDetail(dcm.firstElement(),100,10));
        e.addDetail(new IPDetail(dcm.lastElement(),120,3));
        System.out.println(dao.insert(e));
        
        Vector<ImportRecord> vt = dao.getAll();
        for (int i = 0; i < vt.size(); i++) {
            System.out.println(vt.get(i).toString());
        }
      
    }
    
}
