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
}
