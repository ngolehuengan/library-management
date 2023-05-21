package main.java.com.library.DAL;

import java.sql.ResultSet;

import main.java.com.library.DTO.Lecturer;
import main.java.com.library.DTO.Reader;

public class LecturerDAL {
    static MyConnectUnit connect;

    public static boolean insertLecture(Reader reader,Lecturer lecturer) throws Exception{
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_Lecturer_Insert("+Integer.toString(reader.getID())+","+"\""+ lecturer.getLecturerID()+"\""+","+"\""+lecturer.getDepartmentName()+"\""+");");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return true;
    }

    public static boolean updateLecturer(Reader reader,Lecturer lecturer) throws Exception{
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_Lecturer_Update("+Integer.toString(reader.getID())+","+"\""+ lecturer.getLecturerID()+"\""+","+"\""+lecturer.getDepartmentName()+"\""+");");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return true;

    }

    public boolean storeLecture(){
        return true;
    }

    public boolean reStoreLecture(){
        return true;
    }

    public boolean deleteLecture(){
        return true;
    }
}
