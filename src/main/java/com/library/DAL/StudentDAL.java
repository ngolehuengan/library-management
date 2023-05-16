package main.java.com.library.DAL;

import java.sql.ResultSet;

import main.java.com.library.DTO.Reader;
import main.java.com.library.DTO.Student;

public class StudentDAL {
    static MyConnectUnit connect;

    public static boolean insertStudent(Reader reader,Student student) throws Exception{
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_Student_Insert("+Integer.toString(reader.getID())+","+"\""+student.getStudentID()+"\""+","+"\""+student.getDepartmentName()+"\""+","+"\""+student.getClassName()+"\""+");");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return true;
    }

    public static boolean updateStudent(Reader reader,Student student){
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_Student_Update("+Integer.toString(reader.getID())+","+"\""+student.getStudentID()+"\""+","+"\""+student.getClassName()+"\""+","+"\""+student.getDepartmentName()+"\""+");");
        } catch (Exception e) {
            
        }
        return true;
    }
    
    public boolean storeStudent(){
        return true;
    }

    public boolean reStoreStudent(){
        return true;
    }

    public boolean deleteStudent(){
        return true;
    }
}
