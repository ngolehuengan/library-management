package main.java.com.library.DAL;

import main.java.com.library.DTO.Author;
import main.java.com.library.DTO.Copy;
import main.java.com.library.DTO.Category;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class CopyDAO extends ConnectDB {

// -----------------------------------------------------------------------------   
// Obj doesnt have id nor code
    public int objExistCheck(Copy e) {
        Vector<Vector<Object>> table = executeQuery("SELECT existing_logic FROM COPY WHERE "
                + "title='" + e.getTitle() + "' AND "
                + "publishing_year=" + e.getPublishingYear() + " AND "
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
// sql: INSERT INTO COPY(title,publishing_year,description,image) VALUES ()
// get ID auto from DB
// insert author and category
    public boolean insert(Copy e) {
        int rs = executeUpdate("INSERT INTO COPY(title,publishing_year,description,image) VALUES ("
                + "'" + e.getTitle() + "',"
                + e.getPublishingYear() + ","
                + "'" + e.getDescription() + "',"
                + "'" + e.getImage() + "')");
        if (rs > 0) {
            int id = getByDTO(e).getID();
            updateAuthor(id, e.getAuthor());
            updateCategory(id, e.getCategory());
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean updateTitle(int id, String newData) {
        int rs = executeUpdate("UPDATE COPY SET title='" + newData + "' WHERE copy_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateCategory(int id, Vector<Category> newData) {
        int rs = executeUpdate("DELETE FROM COPY_CATEGORY WHERE copy_id=" + id);
        for (int i = 0; i < newData.size(); i++) {
            rs += executeUpdate("INSERT INTO COPY_CATEGORY VALUES (" + id + "," + newData.get(i).getID() + ")");
        }
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateAuthor(int id, Vector<Author> newData) {
        int rs = executeUpdate("DELETE FROM COPY_AUTHOR WHERE copy_id=" + id);
        for (int i = 0; i < newData.size(); i++) {
            rs += executeUpdate("INSERT INTO COPY_AUTHOR VALUES (" + id + "," + newData.get(i).getID() + ")");
        }
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updatePublishingYear(int id, int newData) {
        int rs = executeUpdate("UPDATE COPY SET publishing_year=" + newData + " WHERE copy_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateDescription(int id, String newData) {
        int rs = executeUpdate("UPDATE COPY SET description='" + newData + "' WHERE copy_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateImage(int id, String newData) {
        int rs = executeUpdate("UPDATE COPY SET image='" + newData + "' WHERE copy_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean delete(int id) {
        int rs = executeUpdate("UPDATE COPY SET existing_logic=false WHERE copy_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean recover(int id) {
        int rs = executeUpdate("UPDATE COPY SET existing_logic=true WHERE copy_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
// -----------------------------------------------------------------------------

    public Copy getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM COPY WHERE copy_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public Copy getByCode(String code) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM COPY WHERE dcm_code='" + code + "'");
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public Copy getByDTO(Copy e) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM COPY WHERE "
                + "title='" + e.getTitle() + "' AND "
                + "publishing_year=" + e.getPublishingYear() + " AND "
                + "description='" + e.getDescription() + "'");
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
    public Vector<Copy> getAll() {
        Vector<Copy> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM COPY WHERE existing_logic=1");
        for (int i = 0; i < table.size(); i++) {
            // Lay ra dong du lieu
            Vector<Object> row = table.get(i);
            // Convert sang DTO va add vao vector
            vt.add(getDTO(row));
        }
        return vt;
    }

// -----------------------------------------------------------------------------
    private Copy getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        String code = (String) row.get(1);
        String title = (String) row.get(2);
        int publishingYear = (int) row.get(3);
        String description = (String) row.get(4);
        String image = (String) row.get(5);

        Copy element = new Copy(id, code, title, publishingYear, description, image);
        element.setAuthor(getAuthor(id));
        element.setCategory(getCategory(id));

        return element;
    }

    private Vector<Author> getAuthor(int copyID) {
        Vector<Author> author = new Vector<>();
        Vector<Vector<Object>> tb = executeQuery("SELECT author_id FROM COPY_AUTHOR WHERE copy_id=" + copyID);
        for (int j = 0; j < tb.size(); j++) {
            int authorID = (int) tb.get(j).get(0);
            AuthorDAO dao = new AuthorDAO();
            Author e = dao.getByID(authorID);
            author.add(e);
        }
        return author;
    }

    private Vector<Category> getCategory(int copyID) {
        Vector<Category> category = new Vector<>();
        Vector<Vector<Object>> t = executeQuery("SELECT category_id FROM COPY_CATEGORY WHERE copy_id=" + copyID);
        for (int j = 0; j < t.size(); j++) {
            int categoryID = (int) t.get(j).get(0);
            CategoryDAO dao = new CategoryDAO();
            Category e = dao.getByID(categoryID);
            category.add(e);
        }
        return category;
    }
}
