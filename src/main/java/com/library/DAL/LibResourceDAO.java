package main.java.com.library.DAL;

import main.java.com.library.DTO.Document;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class LibResourceDAO extends ConnectDB {
    public Vector<Document> getAll() {
        Vector<Document> list = new Vector<>();
        Vector<Vector<Object>> table = executeQuery("SELECT * FROM INDIVIDUAL WHERE existing_logic=true");
        for (int i = 0; i < table.size(); i++) {
            Vector<Object> row = table.get(i);
            Individual element = new Individual((int)row.get(0),
                                                (String)row.get(1),
                                                (String)row.get(2),
                                                (int)row.get(3),
                                                (int)row.get(4),
                                                (boolean)row.get(5));
            list.add(element);
        }
        return list;
    }
}
