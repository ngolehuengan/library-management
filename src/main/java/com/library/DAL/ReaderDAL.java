package main.java.com.library.DAL;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.management.remote.TargetedNotification;

import main.java.com.library.BLL.ReaderBUS;
import main.java.com.library.DTO.Lecturer;
import main.java.com.library.DTO.PersonalInfo;
import main.java.com.library.DTO.Reader;
import main.java.com.library.DTO.Student;

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
    public static Map showTableReader(String condition){
        connect = new MyConnectUnit();
        Map Table = new HashMap();
        try {
            ArrayList<Object> obj = new ArrayList<Object>();
            int totalRow ;
            String query = "CALL SP_Find_Reader("+condition+")"+";";
            ResultSet results = connect.excuteQuery(query);
            int row = 0;
            while(results.next()){
                Reader reader = new Reader();
                reader.setID(results.getInt("reader_id"));
                reader.setClassify(results.getInt("classify"));
                reader.setRegistrationDate(results.getDate("registrationDate").toString());
                reader.setExpirationDate(results.getDate("ExpirationDate").toString());
                reader.setTotal_debt(results.getDouble("total_debt"));
                obj.add(reader);
                PersonalInfo info = new PersonalInfo();
                info.setFullName(results.getString("fullName"));
                info.setAddress(results.getString("Address"));
                info.setBirthday(results.getDate("Birthday").toLocalDate());
                info.setCitizenID(results.getString("citizenID"));
                info.setIsMale(results.getBoolean("isMale"));
                info.setPhoneNumber(results.getString("phoneNumber"));
                info.setEmail(results.getString("email"));
                obj.add(info);
                if(results.getInt("classify") == 1) {
                    Lecturer lecturer = new Lecturer();
                    lecturer.setLecturerID(results.getString("lecturer_id"));
                    lecturer.setDepartmentName(results.getString("departmentName"));
                    obj.add(lecturer);
                }
                if (results.getInt("classify") == 2){
                    Student student = new Student();
                    student.setStudentID(results.getString("student_id"));
                    student.setDepartmentName(results.getString("departmentName"));
                    student.setClassName(results.getString("className"));
                    obj.add(student);
                }
                Table.put(row,obj);
                row++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return Table;
    }
       public static void main(String[] args) {


    }
}
