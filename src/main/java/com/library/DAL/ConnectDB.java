package main.java.com.library.DAL;

import java.sql.*;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class ConnectDB {

    private final String server = "localhost";
    private final String port = "3306";
    private final String database = "LIBRARY_MANAGEMENT";
    private final String url = "jdbc:mysql://" + server + ":" + port + "/" + database;
    private final String username = "root";
    private final String password = "";
    protected Connection conn;

// -----------------------------------------------------------------------------
//  DriverManager  
    public boolean getConnection() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

//  conn.close() if it open    
    public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//  Statement stm = conn.createStatement();
//  ResultSet rs = stm.executeQuery(sql); 
//  ResultSetMetaData rsmd = rs.getMetaData();
//  int size = rsmd.getColumnCount();
    public Vector<Vector<Object>> executeQuery(String sql) {
        Vector<Vector<Object>> table = new Vector<>();
        if (getConnection())
            try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int size = rsmd.getColumnCount();
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= size; i++) {
                    row.add(rs.getObject(i));
                }
                table.add(row);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }
        return table;
    }

//  getConnection ? continute : rs = -1   
    public int executeUpdate(String sql) {
        int rs = -1;
        if (getConnection())
            try {
            Statement stm = conn.createStatement();
            rs = stm.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }
        return rs;
    }
}
