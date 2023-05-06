package DAL;

import DTO.Publisher;
import java.util.Vector;

/** update
 *
 * @author ant1006
 */
public class PublisherDAO extends ConnectDB {
//--insert--
    public boolean insert(Publisher element) {
        int rs = executeUpdate("INSERT INTO PUBLISHER VALUES (" 
                                    + element.getID() + ",'" 
                                    + element.getName() + "')");
        if (rs > 0) return true;
        return false;
    }   
  
//--update--    
    public boolean updateName(int id, String name) {
        int rs = executeUpdate("UPDATE PUBLISHER SET publisher_name='"+name+"' WHERE publisher_id=" + id);
        if (rs > 0) return true;
        return false;
    }
    
//--delete--    
    public boolean deleteByID(int id) {
        int rs = executeUpdate("UPDATE PUBLISHER SET existing_logic=false WHERE publisher_id="+id);
        if (rs > 0) return true;
        return false;
    }

    public boolean deleteByName(String name) {
        int rs = executeUpdate("UPDATE PUBLISHER SET existing_logic=false WHERE publisher_name='"+name+"'");
        if (rs > 0) return true;
        return false;
    }

//    public boolean deleteByID(int id) {
//        int rs = executeUpdate("DELETE FROM PUBLISHER WHERE publisher_id="+id);
//        if (rs > 0) return true;
//        return false;
//    }
//
//    public boolean deleteByName(String name) {
//        int rs = executeUpdate("DELETE FROM PUBLISHER WHERE publisher_name='"+name+"'");
//        if (rs > 0) return true;
//        return false;
//    }
//
//--get one--    
    public Publisher getByID(int id) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM PUBLISHER WHERE publisher_id="+id+" AND existing_logic=true");
        if (table.isEmpty()) 
            return null;
        Vector<Object> row = table.get(0);
        Publisher result = new Publisher((int)row.get(0),(String)row.get(1));
        return result;
    }
    
    public Publisher getByName(String name) {
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM PUBLISHER WHERE publisher_name='"+name+"' AND existing_logic=true");
        if (table.isEmpty()) 
            return null;
        Vector<Object> row = table.get(0);
        Publisher result = new Publisher((int)row.get(0),(String)row.get(1));
        return result;
    }
    
//--get all--
    public Vector<Publisher> getAll() {
        Vector<Publisher> list = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM PUBLISHER WHERE existing_logic=true");
        for (int i = 0; i < table.size(); i++) {
            Vector<Object> row = table.get(i);
            int id = (int)row.get(0);
            String name = (String)row.get(1);
            list.add(new Publisher(id,name));
        }
        return list;
    }
}
