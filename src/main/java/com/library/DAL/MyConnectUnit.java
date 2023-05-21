package main.java.com.library.DAL;
import java.sql.ResultSet;

/**
 * Kết nối SQL nâng cao
 */
public class MyConnectUnit  {
    //biến kết nối cơ bản
    private MySQLConnection connect;
    // hàm khởi tạo kết nối mặc định
    public MyConnectUnit() {
        connect = new MySQLConnection("localhost", "root", "qltv@1234", "LIBRARY_MANAGEMENT");
    }
    
    // hàm khởi tạo cơ bản
    public MyConnectUnit(String Host, String Username, String Password, String Database) {
        connect = new MySQLConnection(Host, Username, Password, Database);
    }

    public ResultSet excuteQuery(String Query) throws Exception{
        try {
            // thực thi câu lệnh
            this.connect.resultSet = connect.getStatement().executeQuery(Query);
            Close();
        } catch (Exception e) {
            throw new Exception("Error excuteQuery " + e.getMessage());
        }
        
        return this.connect.resultSet;
    }

    // hàm đóng kết nối 
    public void Close() throws Exception {
        this.connect.Close();
    }
}