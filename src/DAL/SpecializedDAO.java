package DAL;

import DTO.Specialized;
import java.util.Vector;

/**
 *
 * @specialized ant1006
 */
public class SpecializedDAO extends ConnectDB {
//--insert--
    public boolean insert(Specialized element) {
        int rs = executeUpdate("INSERT INTO SPECIALIZED VALUES (" 
                                    + element.getID() + ",'" 
                                    + element.getName() + "')");
        if (rs > 0) return true;
        return false;
    }   
  
//--update--    
    public boolean updateName(int id, String name) {
        int rs = executeUpdate("UPDATE SPECIALIZED SET specialized_name='"+name+"' WHERE specialized_id=" + id);
        if (rs > 0) return true;
        return false;
    }
    
//--delete--    
    public boolean deleteByID(int id) {
        int rs = executeUpdate("UPDATE SPECIALIZED SET existing_logic=false WHERE specialized_id=" + id);
        if (rs > 0) return true;
        return false;
    }

    public boolean deleteByName(String name) {
        int rs = executeUpdate("UPDATE SPECIALIZED SET existing_logic=false WHERE specialized_name='"+name+"'");
        if (rs > 0) return true;
        return false;
    }

//    public boolean deleteByID(int id) {
//        int rs = executeUpdate("DELETE FROM SPECIALIZED WHERE specialized_id="+id);
//        if (rs > 0) return true;
//        return false;
//    }
//
//    public boolean deleteByName(String name) {
//        int rs = executeUpdate("DELETE FROM SPECIALIZED WHERE specialized_name='"+name+"'");
//        if (rs > 0) return true;
//        return false;
//    }
//
//--get one--    
    public Specialized getByID(int id) {
        Specialized result = null;
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM SPECIALIZED WHERE specialized_id="+id+" AND existing_logic=true");
        Vector<Object> row = table.get(0);
        result = new Specialized((int)row.get(0),(String)row.get(1),(String)row.get(2));
        return result;
    }
    
    public Specialized getByName(String name) {
        Specialized result = null;
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM SPECIALIZED WHERE specialized_name='"+name+"' AND existing_logic=true");
        Vector<Object> row = table.get(0);
        result = new Specialized((int)row.get(0),(String)row.get(1),(String)row.get(2));
        return result;
    }
    
//--get all--
    public Vector<Specialized> getAll() {
        Vector<Specialized> list = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM SPECIALIZED WHERE existing_logic=true");
        for (int i = 0; i < table.size(); i++) {
            Vector<Object> row = table.get(i);
            int id = (int)row.get(0);
            String code = (String)row.get(1);
            String name = (String)row.get(2);
            list.add(new Specialized(id,code,name));
        }
        return list;
    }
}
