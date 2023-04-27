package DAL;

import DTO.Publisher;
import java.util.Vector;

/** update
 *
 * @author ant1006
 */
public class DAOPublisher extends ConnectDB {
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
        int rs = executeUpdate("DELETE FROM PUBLISHER WHERE publisher_id="+id);
        if (rs > 0) return true;
        return false;
    }

    public boolean deleteByName(String name) {
        int rs = executeUpdate("DELETE FROM PUBLISHER WHERE publisher_name='"+name+"'");
        if (rs > 0) return true;
        return false;
    }

//--get one--    
    public Publisher getByID(int id) {
        Publisher result = null;
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM PUBLISHER WHERE publisher_id="+id);
        Vector<Object> row = table.get(0);
        result = new Publisher((int)row.get(0),(String)row.get(1));
        return result;
    }
    
    public Publisher getByName(String name) {
        Publisher result = null;
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM PUBLISHER WHERE publisher_name='"+name+"'");
        Vector<Object> row = table.get(0);
        result = new Publisher((int)row.get(0),(String)row.get(1));
        return result;
    }
    
//--get all--
    public Vector<Publisher> getAll() {
        Vector<Publisher> publishers = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM PUBLISHER");
        for (int i = 0; i < table.size(); i++) {
            Vector<Object> row = table.get(i);
            int id = (int)row.get(0);
            String name = (String)row.get(1);
            publishers.add(new Publisher(id,name));
        }
        return publishers;
    }
    
    public static void main (String[] args) {
        DAOPublisher dao = new DAOPublisher();
//        dao.getAll();
//        Vector<Publisher> list = dao.getAll();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
//        }
//        dao.deleteByID(10);
//        Publisher element = new Publisher(10,"KHONG CO");
//        dao.insert(element);
//        System.out.println(dao.getByName("NXB KIM DONG").toString());
    }
}
