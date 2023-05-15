package main.java.com.library.DAL;

import main.java.com.library.DTO.Author;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class AuthorDAO extends ConnectDB {
//--insert--
    public boolean insert(Author element) {
        int rs = executeUpdate("INSERT INTO AUTHOR(author_name) VALUES ('" + element.getName() + "')");
        if (rs > 0) return true;
        return false;
    }   
  
//--update--    
    public boolean updateName(int id, String name) {
        int rs = executeUpdate("UPDATE AUTHOR SET author_name='"+name+"' WHERE author_id=" + id);
        if (rs > 0) return true;
        return false;
    }
    
//--delete--    
    public boolean deleteByID(int id) {
        int rs = executeUpdate("DELETE FROM AUTHOR WHERE author_id="+id);
        if (rs > 0) return true;
        return false;
    }

    public boolean deleteByName(String name) {
        int rs = executeUpdate("DELETE FROM AUTHOR WHERE author_name='"+name+"'");
        if (rs > 0) return true;
        return false;
    }

//--get one--    
    public Author getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM AUTHOR WHERE author_id="+id);
        if (table.isEmpty()) {
            return null;
        }
        
        Vector<Object> row = table.get(0);
        Author result = new Author((int)row.get(0),(String)row.get(1));
        return result;
    }
    
    public Author getByName(String name) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM AUTHOR WHERE author_name='"+name+"'");
        if (table.isEmpty()) {
            return null;
        }
        
        Vector<Object> row = table.get(0);
        Author result = new Author((int)row.get(0),(String)row.get(1));
        return result;
    }    
    
//--get all--
    public Vector<Author> getAll() {
        Vector<Author> list = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM AUTHOR");
        for (int i = 0; i < table.size(); i++) {
            Vector<Object> row = table.get(i);
            int id = (int)row.get(0);
            String name = (String)row.get(1);
            list.add(new Author(id,name));
        }
        return list;
    }
    
    public Vector<Author> getByID(Vector<Integer> vt) {
        Vector<Author> rs = new Vector<>();
        for (int i = 0; i < vt.size(); i++) {
            rs.add(getByID(vt.get(i)));
        }
        return rs;
    }

}
