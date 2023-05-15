package main.java.com.library.DAL;

import main.java.com.library.DTO.Other;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class OtherDAO extends ConnectDB {

// -----------------------------------------------------------------------------   
// Obj doesnt have id nor code
    public int objExistCheck(Other e) {
        Vector<Vector<Object>> table = executeQuery("SELECT existing_logic FROM OTHER WHERE "
                + "title='" + e.getTitle() + "' AND "
                + "description='" + e.getDescription() + "'");
        if (table.isEmpty()) {
            return -1;
        }
        if ((boolean) table.get(0).get(0)) {
            return 1;
        }
        return 0;
    }

// -----------------------------------------------------------------------------    
// sql: INSERT INTO OTHER(title,description,image) VALUES ()
    public boolean insert(Other e) {
        int rs = executeUpdate("INSERT INTO OTHER(title,description,image) VALUES ("
                + "'" + e.getTitle() + "',"
                + "'" + e.getDescription() + "',"
                + "'" + e.getImage() + "')");
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean updateTitle(int id, String newData) {
        int rs = executeUpdate("UPDATE OTHER SET title='" + newData + "' WHERE other_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateDescription(int id, String newData) {
        int rs = executeUpdate("UPDATE OTHER SET description='" + newData + "' WHERE other_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateImage(int id, String newData) {
        int rs = executeUpdate("UPDATE OTHER SET image='" + newData + "' WHERE other_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean delete(int id) {
        int rs = executeUpdate("UPDATE OTHER SET existing_logic=false WHERE other_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean recover(int id) {
        int rs = executeUpdate("UPDATE OTHER SET existing_logic=true WHERE other_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
// -----------------------------------------------------------------------------
    public Other getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM OTHER WHERE other_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public Other getByCode(String code) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM OTHER WHERE dcm_code='" + code + "'");
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public Other getByDTO(Other e) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM OTHER WHERE "
                + "title='" + e.getTitle() + "' AND "
                + "description='" + e.getDescription() + "'");
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
    public Vector<Other> getAll() {
        Vector<Other> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM OTHER WHERE existing_logic=1");
        for (int i = 0; i < table.size(); i++) {
            // Lay ra dong du lieu
            Vector<Object> row = table.get(i);
            // Convert sang DTO va add vao vector
            vt.add(getDTO(row));
        }
        return vt;
    }

// -----------------------------------------------------------------------------
    private Other getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        String code = (String) row.get(1);
        String title = (String) row.get(2);
        String description = (String) row.get(3);
        String image = (String) row.get(4);

        Other element = new Other(id, code, title, description, image);
        return element;
    }
}
