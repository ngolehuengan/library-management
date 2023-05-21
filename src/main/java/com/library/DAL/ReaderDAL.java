package main.java.com.library.DAL;

import java.sql.ResultSet;
import java.util.ArrayList;

import main.java.com.library.BLL.ReaderBUS;
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
    public static String[][] showTableReader(String condition){
        connect = new MyConnectUnit();
        String[][] show = new String[0][0];
        try {
            int totalRow ;

            String query = "CALL SP_Find_Reader("+condition+")"+";";
            ResultSet results = connect.excuteQuery(query);
            results.last();
            totalRow = results.getRow();
            show = new String[totalRow][9];
            int row = 0;
            while(results.next() || row == 0){
                if(row == 0) results.first();
                show[row][0] = Integer.toString(row + 1);
                if (results.getInt("classify") == 1){
                    show[row][3] = "Giảng Viên";
                    show[row][1] = "GV" + Integer.toString(results.getInt("lecturer_id"));
                    show[row][4] = results.getString("lecturer_id");
                } 
                else {
                    show[row][3] = "Sinh Viên";
                    show[row][1] = "SV" + Integer.toString(results.getInt("reader_id"));
                    show[row][4] = results.getString("student_id");  
                }
                show[row][2] = results.getString("fullName");
                show[row][5] = results.getString("departmentName");
                show[row][6] = Double.toString(results.getDouble("total_debt"));
                show[row][7] = results.getDate("registrationDate").toString();
                show[row][8] = results.getDate("ExpirationDate").toString();
                row++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return show;
    }
    public static String[][] filterResult(String[][] result,String classify, String departmentName) {
        ArrayList<String[]> listItem = new ArrayList<String[]>();
        if(result.length == 0) return result;
        if (departmentName.isEmpty()){
            for(int i = 0;i<result.length;i++){
                if(result[i][3].equals(classify)){
                    listItem.add(result[i]);
                }
            }
        }
        else if (classify.isEmpty()){
            for(int i = 0;i<result.length;i++){
                if(result[i][5].equals(departmentName)){
                    listItem.add(result[i]);
                }
            }
        }
        else {
            for(int i = 0;i<result.length;i++){
                if(result[i][5].equals(departmentName) && result[i][3].equals(classify)){
                    listItem.add(result[i]);
                }
            }
        }
        result = new String [listItem.size()][9];
        for (int i =0;i<listItem.size();i++){
            result[i] = listItem.get(i);

        }
        return result;
    }
    public static void main(String[] args) {


    }
}
