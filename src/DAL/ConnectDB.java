package DAL;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author ant1006
 */
public class ConnectDB {
    protected Connection connect = null;
    
    public ConnectDB() {
        try {
            Class.forName("");
            String url = "";
            String user = "";
            String password = "";
            connect = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {}
    }
}
