package DAL;

import DTO.Author;
import DTO.Book;
import DTO.Category;
import DTO.Publisher;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class BookDAO extends ConnectDB {
// -----------------------------------------------------------------------------
// Obj doesnt have id nor code

    public int objExistCheck(Book element) {
        Vector<Vector<Object>> table = executeQuery("SELECT existing_logic FROM BOOK WHERE isbn=" + element.getISBN());
        if (table.isEmpty()) {
            return -1;
        }
        if ((boolean) table.get(0).get(0)) {
            return 1;
        }
        return 0;
    }

    public int objCorrectCheck(Book element) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM BOOK WHERE isbn=" + element.getISBN());
        if (table.isEmpty()) {
            return -1;
        }
        Book objDB = getDTO(table.get(0));
        if (element.equals(objDB)) {
            return 1;
        }
        return 0;
    }

// -----------------------------------------------------------------------------    
    public boolean insert(Book e) {
        int rs = executeUpdate("INSERT INTO BOOK(isbn,title,publisher_id,publishing_year,description,image) VALUES ("
                + e.getISBN() + ","
                + e.getTitle() + ","
                + e.getPublisher().getID() + ","
                + e.getPublishingYear() + ","
                + e.getDescription() + ","
                + e.getImage() + ")");
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean updateTitle(int id, String newData) {
        int rs = executeUpdate("UPDATE BOOK SET title=" + newData + "WHERE book_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
    public boolean updateCategory(int id, Vector<Category> newdata) {
        Vector<Category> olddata = getCategory(id);
        String 
        for (int i = 0; i < newdata.size(); i++) {
            
        }
        Vector<Vector<Object>> t = executeQuery("SELECT category_id FROM BOOK_CATEGORY WHERE book_id=" + bookID 
                + " AND category_id NOT IN ()");
        for (int j = 0; j < t.size(); j++) {
            int categoryID = (int) t.get(j).get(0);
            CategoryDAO dao = new CategoryDAO();
            Category e = dao.getByID(categoryID);
            category.add(e);
        }
        return category;
    
        int rs = executeUpdate("UPDATE BOOK SET publisher_id=" + newData + "WHERE book_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }
    
//    public boolean updateAuthor(int id, Vector<Author> newData) {
//        int rs = executeUpdate("UPDATE BOOK SET publisher_id=" + newData + "WHERE book_id=" + id);
//        if (rs > 0) {
//            return true;
//        }
//        return false;
//    }
    
    public boolean updatePublisher(int id, Publisher newData) {
        int rs = executeUpdate("UPDATE BOOK SET publisher_id=" + newData.getID() + "WHERE book_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updatePublishingYear(int id, int newData) {
        int rs = executeUpdate("UPDATE BOOK SET publishing_year=" + newData + "WHERE book_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateDescription(int id, String newData) {
        int rs = executeUpdate("UPDATE BOOK SET description=" + newData + "WHERE book_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

    public boolean updateImage(int id, String newData) {
        int rs = executeUpdate("UPDATE BOOK SET image=" + newData + "WHERE book_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------    
    public boolean delete(int id) {
        int rs = executeUpdate("UPDATE BOOK SET existing_logic=false WHERE book_id=" + id);
        if (rs > 0) {
            return true;
        }
        return false;
    }

// -----------------------------------------------------------------------------
    public Book getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM BOOK WHERE book_id=" + id);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public Book getByCode(String code) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM BOOK WHERE dcm_code=" + code);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

    public Book getByISBN(String ISBN) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM BOOK WHERE isbn=" + ISBN);
        if (table.isEmpty()) {
            return null;
        }

        Vector<Object> row = table.get(0);
        return getDTO(row);
    }

// -----------------------------------------------------------------------------
    public Vector<Book> getAll() {
        Vector<Book> vt = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM BOOK WHERE existing_logic=true");
        for (int i = 0; i < table.size(); i++) {
            // Lay ra dong du lieu
            Vector<Object> row = table.get(i);
            // Convert sang DTO va add vao vector
            vt.add(getDTO(row));
        }
        return vt;
    }

// -----------------------------------------------------------------------------
    private Book getDTO(Vector<Object> row) {
        int id = (int) row.get(0);
        String code = (String) row.get(1);
        String ISBN = (String) row.get(2);
        String title = (String) row.get(3);
        int publisherID = (int) row.get(4);
        PublisherDAO dao = new PublisherDAO();
        Publisher publisher = dao.getByID(publisherID);
        int publishingYear = (int) row.get(5);
        String description = (String) row.get(6);
        String image = (String) row.get(7);

        Book element = new Book(id, code, ISBN, title, publisher, publishingYear, description, image);
        element.setAuthor(getAuthor(id));
        element.setCategory(getCategory(id));

        return element;
    }

    private Vector<Author> getAuthor(int bookID) {
        Vector<Author> author = new Vector<>();
        Vector<Vector<Object>> tb = executeQuery("SELECT author_id FROM BOOK_AUTHOR WHERE book_id=" + bookID);
        for (int j = 0; j < tb.size(); j++) {
            int authorID = (int) tb.get(j).get(0);
            AuthorDAO dao = new AuthorDAO();
            Author e = dao.getByID(authorID);
            author.add(e);
        }
        return author;
    }

    private Vector<Category> getCategory(int bookID) {
        Vector<Category> category = new Vector<>();
        Vector<Vector<Object>> t = executeQuery("SELECT category_id FROM BOOK_CATEGORY WHERE book_id=" + bookID);
        for (int j = 0; j < t.size(); j++) {
            int categoryID = (int) t.get(j).get(0);
            CategoryDAO dao = new CategoryDAO();
            Category e = dao.getByID(categoryID);
            category.add(e);
        }
        return category;
    }

}
