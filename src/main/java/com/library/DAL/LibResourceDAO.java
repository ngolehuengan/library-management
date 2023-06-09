package main.java.com.library.DAL;

import main.java.com.library.DTO.Document;
import main.java.com.library.DTO.LibResource;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class LibResourceDAO extends ConnectDB {

// -----------------------------------------------------------------------------   
// Obj doesnt have id nor code
    public int objExistCheck(LibResource e) {
        Vector<Vector<Object>> table = executeQuery("SELECT existing_logic FROM LIBRARY_RESOURCE WHERE dcm_code='" + e.getDocument().getCode());
        if (table.isEmpty()) {
            return -1;
        }
        if ((boolean) table.get(0).get(0)) {
            return 1;
        }
        return 0;
    }

// -----------------------------------------------------------------------------    
// sql: INSERT INTO LIBRARY_RESOURCE(dcm_code,price) VALUES ()
    public boolean insert(LibResource e) {
        int rs = executeUpdate("INSERT INTO LIBRARY_RESOURCE(dcm_code,price,total_quantity,available_quantity) VALUES ("
                + "'" + e.getDocument().getCode() + "',"
                      + e.getPrice() + ","
                      + e.getTotalQuantity() + ","
                      + e.getAvailableQuantity() + ")");
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean updatePrice(int id, double newData) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET price=" + newData + "WHERE rs_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean updatePrice(String code, double newData) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET price=" + newData + " WHERE dcm_code='" + code + "'");
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean updateTotalQuantity(int id, int newData) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET total_quantity=" + newData + " WHERE rs_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean addTotalQuantity(String code, int data) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET total_quantity=total_quantity+" + data + " WHERE dcm_code='" + code + "'");
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean subtractTotalQuantity(String code, int data) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET total_quantity=total_quantity-" + data + " WHERE dcm_code='" + code + "'");
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean updateAvailableQuantity(int id, int newData) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET available_quantity=" + newData + " WHERE rs_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean addAvailableQuantity(String code, int data) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET available_quantity=available_quantity+" + data + " WHERE dcm_code='" + code + "'");
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean subtractAvailableQuantity(String code, int data) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET available_quantity=available_quantity-" + data + " WHERE dcm_code='" + code + "'");
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean incAvailableQuantity(int id) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET available_quantity=available_quantity+1 WHERE rs_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean decAvailableQuantity(int id) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET available_quantity=available_quantity-1 WHERE rs_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    public boolean updateBorrowable(int id, boolean newData) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET borrowable_logic=" + newData + " WHERE rs_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean delete(int id) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET existing_logic=false WHERE rs_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean recover(int id) {
        int rs = executeUpdate("UPDATE LIBRARY_RESOURCE SET existing_logic=true WHERE rs_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
// -----------------------------------------------------------------------------
    public LibResource getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LIBRARY_RESOURCE WHERE rs_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public LibResource getByCode(String code) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LIBRARY_RESOURCE WHERE dcm_code='" + code + "'");
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
    public Vector<LibResource> getAll() {
        Vector<LibResource> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LIBRARY_RESOURCE WHERE existing_logic=1");
        for (int i = 0; i < table.size(); i++) {
            // Lay ra dong du lieu
            Vector<Object> row = table.get(i);
            // Convert sang DTO va add vao vector
            vt.add(getDTO(row));
        }
        return vt;
    }
    
    public Vector<LibResource> getAvaiResources() {
        Vector<LibResource> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM LIBRARY_RESOURCE WHERE existing_logic=1 AND available_quantity > 0");
        for (int i = 0; i < table.size(); i++) {
            // Lay ra dong du lieu
            Vector<Object> row = table.get(i);
            // Convert sang DTO va add vao vector
            vt.add(getDTO(row));
        }
        return vt;
    }
    

// -----------------------------------------------------------------------------
    private LibResource getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        String code = (String) row.get(1);
        Document document = new DocumentDAO().getByCode(code); 
        double price = (double) row.get(2);
        int totalQuantity = (int) row.get(3);
        int availableQuantity = (int) row.get(4);
        boolean borrowable = (boolean) row.get(5);
        

        LibResource element = new LibResource(id, document, price, totalQuantity, availableQuantity, borrowable);
        return element;
    }
}
