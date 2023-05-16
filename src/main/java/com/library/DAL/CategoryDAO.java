package main.java.com.library.DAL;

import main.java.com.library.DTO.Category;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class CategoryDAO extends ConnectDB {
//--insert--
    public boolean insert(Category element) {
        int rs = executeUpdate("INSERT INTO CATEGORY VALUES (category_name) VALUES ('" + element.getName() + "')");                                 
        if (rs > 0) return true;
        return false;
    }   
  
//--update--    
    public boolean updateName(int id, String name) {
        int rs = executeUpdate("UPDATE CATEGORY SET category_name='"+name+"' WHERE category_id=" + id);
        if (rs > 0) return true;
        return false;
    }
    
//--delete--    
    public boolean deleteByID(int id) {
        int rs = executeUpdate("DELETE FROM CATEGORY WHERE category_id="+id);
        if (rs > 0) return true;
        return false;
    }

    public boolean deleteByName(String name) {
        int rs = executeUpdate("DELETE FROM CATEGORY WHERE category_name='"+name+"'");
        if (rs > 0) return true;
        return false;
    }

//--get one--    
    public Category getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM CATEGORY WHERE category_id="+id);
        if (table.isEmpty())
            return null;
        Vector<Object> row = table.get(0);
        Category result = new Category((int)row.get(0),(String)row.get(1));
        return result;
    }
    
    public Category getByName(String name) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM CATEGORY WHERE category_name='"+name+"'");
        if (table.isEmpty())
            return null;
        Vector<Object> row = table.get(0);
        Category result = new Category((int)row.get(0),(String)row.get(1));
        return result;
    }
    
//--get all--
    public Vector<Category> getAll() {
        Vector<Category> list = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM CATEGORY");
        for (int i = 0; i < table.size(); i++) {
            Vector<Object> row = table.get(i);
            int id = (int)row.get(0);
            String name = (String)row.get(1);
            list.add(new Category(id,name));
        }
        return list;
    }
    
    public Vector<Category> getByID(Vector<Integer> vt) {
        Vector<Category> rs = new Vector<>();
        for (int i = 0; i < vt.size(); i++) {
            rs.add(getByID(vt.get(i)));
        }
        return rs;
    }
}
