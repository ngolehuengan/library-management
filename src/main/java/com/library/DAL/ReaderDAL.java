package main.java.com.library.DAL;

import java.sql.ResultSet;
import java.util.ArrayList;

import main.java.com.library.DTO.PersonalInfo;
import main.java.com.library.DTO.Reader;

public class ReaderDAL {
    static MyConnectUnit connect;


    public static int insertReader(Reader reader,PersonalInfo info){
        connect = new MyConnectUnit();
        try {
            ResultSet results = connect.excuteQuery("CALL SP_Reader_Insert("+Integer.toString(reader.getClassify())+","+"\""+info.getCitizenID()+"\""+","+Integer.toString(reader.getDuration())+");");
            results.next();
            return results.getInt(1);
        } catch (Exception e) {
            return -1;
        }

    }

    public static int updateReader(Reader reader,PersonalInfo info){
        connect = new MyConnectUnit();
        try {
            ResultSet results = connect.excuteQuery("CALL SP_Reader_Update("+Integer.toString(reader.getID())+","+"\""+info.getCitizenID()+"\""+","+Integer.toString(reader.getDuration())+","+Double.toString(reader.getTotal_debt())+");");
            results.next();
            return results.getInt(1);
        } catch (Exception e) {
            return -1;
        }
    }

    public static boolean storeReader(Reader reader){
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_READER_UpdateHide("+Integer.toString(reader.getID())+","+"false"+");");
        } catch (Exception e) {
            // TODO: handle exception
        }
        return true;
    }
    public static void updateTotalDebt(String reader_id,String fine){
        connect = new MyConnectUnit();
        try {
            ResultSet results = connect.excuteQuery("CALL SP_Reader_UpdateTotalDebt("+"\""+reader_id+"\""+","+"\""+fine+"\""+");");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean reStoreReader(){
        return true;
    }

    public boolean deleteReader(){
        return true;
    }
    public static ArrayList getDepartmentList(){
        ArrayList<String> department = new ArrayList<String>();
        MyConnectUnit connect = new MyConnectUnit();
        try {
            ResultSet results = connect.excuteQuery("SELECT departmentName FROM DEPARTMENT_INFO");
       
            while(results.next()){
                department.add(results.getString(1));
            }
        } catch (Exception e) {
            
        }
        return department;
    }
    public static String[][] showTableReader(){
        connect = new MyConnectUnit();
        String[][] show = new String[0][0];
        try {
            String query ="CALL SP_Reader_CountRow_Show()";
            ResultSet results = connect.excuteQuery(query);
            results.next();
    
            int totalRow = results.getInt(0);
            query = "CALL SP_Reader_Show();";
            results = connect.excuteQuery(query);
    
            show = new String[totalRow][9];
            int row = 0;
            while(results.next()){
                show[row][0] = Integer.toString(row + 1);
                if (results.getInt("classify") == 1){
                    show[row][3] = "Giảng viên";
                    show[row][1] = "GV" + Integer.toString(results.getInt("id"));
                    show[row][4] = results.getString("student_id");
                } 
                else {
                    show[row][3] = "Sinh Viên";
                    show[row][1] = "SV" + Integer.toString(results.getInt("id"));
                    show[row][4] = results.getString("lecturer_id");  
                }
                show[row][2] = results.getString("fullName");
                show[row][5] = results.getString("departmentName");
                show[row][6] = Double.toString(results.getDouble("total_debt"));
                show[row][7] = results.getDate("registrationDate").toString();
                show[row][8] = results.getDate("ExpirationDate").toString();
                row++;
            }
        } catch (Exception e) {

        }
        return show;
    }

}
