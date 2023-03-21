package DAL;

import DTO.Book;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class DAOBook extends ConnectDB {
    public boolean insert(Book element) {
        return true;
    }
    
    public boolean update(String ISBN, Book element) {
        return true;
    }
    
    public boolean delete(Book element) {
        return true;
    }
    
    public Book get(String ISBN) {
        Book book = null;
        return book;
    }
    
    public Vector<Book> selectAll() {
        Vector<Book> books = null;
        return books;
    }
}
