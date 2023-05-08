package main.java.com.library.DAL;

import main.java.com.library.DTO.Author;
import main.java.com.library.DTO.Theses;
import main.java.com.library.DTO.Specialized;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class ThesesDAO extends ConnectDB {
// -----------------------------------------------------------------------------
// Obj doesnt have id nor code
    public int objExistCheck(Theses e) {
        Vector<Vector<Object>> table = executeQuery("SELECT existing_logic FROM THESES WHERE "
                + "title='" + e.getTitle() + "' AND "
                + "defense_year=" + e.getDefenseYear() + " AND "
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
// sql: INSERT INTO THESES(title,specialized_id,defense_year,description,image) VALUES ()
// get ID auto from DB
// insert author and category
    
    public boolean insert(Theses e) {
        int rs = executeUpdate("INSERT INTO THESES(title,spcl_id,defense_year,description,image) VALUES ("
                + "'" + e.getTitle() + "',"
                      + e.getSpecialized().getID() + ","
                      + e.getDefenseYear() + ","
                + "'" + e.getDescription() + "',"
                + "'" + e.getImage() + "')");   
        if (rs > 0) {
            int id = getByDTO(e).getID();
            updateAuthor(id,e.getAuthor());
            return true;
        }
        return false;
    }
    
// -----------------------------------------------------------------------------    
    public boolean updateTitle(int id, String newData) {
        int rs = executeUpdate("UPDATE THESES SET title='" + newData + "' WHERE theses_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
    public boolean updateAuthor(int id, Vector<Author> newData) {
        int rs = executeUpdate("DELETE FROM THESES_AUTHOR WHERE theses_id=" + id);
        for (int i = 0; i < newData.size(); i++) 
            rs += executeUpdate("INSERT INTO THESES_AUTHOR VALUES (" + id + "," + newData.get(i).getID() + ")");
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
    public boolean updateSpecialized(int id, Specialized newData) {
        int rs = executeUpdate("UPDATE THESES SET spcl_id=" + newData.getID() + "WHERE theses_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateDefenseYear(int id, int newData) {
        int rs = executeUpdate("UPDATE THESES SET defense_year=" + newData + "WHERE theses_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateDescription(int id, String newData) {
        int rs = executeUpdate("UPDATE THESES SET description='" + newData + "' WHERE theses_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateImage(int id, String newData) {
        int rs = executeUpdate("UPDATE THESES SET image='" + newData + "' WHERE theses_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean delete(int id) {
        int rs = executeUpdate("UPDATE THESES SET existing_logic=false WHERE theses_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
    public boolean recover(int id) {
        int rs = executeUpdate("UPDATE THESES SET existing_logic=true WHERE theses_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
// -----------------------------------------------------------------------------
    public Theses getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM THESES WHERE theses_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public Theses getByCode(String code) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM THESES WHERE dcm_code='" + code + "'");
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public Theses getByDTO(Theses e) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM THESES WHERE "
                + "title='" + e.getTitle() + "' AND "
                + "defense_year=" + e.getDefenseYear() + " AND "
                + "description='" + e.getDescription() + "'");
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
    public Vector<Theses> getAll() {
        Vector<Theses> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM THESES WHERE existing_logic=1");
        for (int i = 0; i < table.size(); i++) {
            // Lay ra dong du lieu
            Vector<Object> row = table.get(i);
            // Convert sang DTO va add vao vector
            vt.add(getDTO(row));
        }
        return vt;
    }

// -----------------------------------------------------------------------------
    private Theses getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        String code = (String) row.get(1);
        String title = (String) row.get(2);
        int specializedID = (int) row.get(3);
        SpecializedDAO dao = new SpecializedDAO();
        Specialized specialized = dao.getByID(specializedID);
        int defenseYear = (int) row.get(4);
        String description = (String) row.get(5);
        String image = (String) row.get(6);

        Theses element = new Theses(id, code, title, specialized, defenseYear, description, image);
        element.setAuthor(getAuthor(id));

        return element;
    }

    private Vector<Author> getAuthor(int thesesID) {
        Vector<Author> author = new Vector<>();
        Vector<Vector<Object>> tb = executeQuery("SELECT author_id FROM THESES_AUTHOR WHERE theses_id=" + thesesID);
        for (int j = 0; j < tb.size(); j++) {
            int authorID = (int) tb.get(j).get(0);
            AuthorDAO dao = new AuthorDAO();
            Author e = dao.getByID(authorID);
            author.add(e);
        }
        return author;
    }
}