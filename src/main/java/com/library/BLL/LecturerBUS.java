package main.java.com.library.BLL;

import main.java.com.library.DAL.LecturerDAL;
import main.java.com.library.DAL.MyConnectUnit;
import main.java.com.library.DTO.Lecturer;
import main.java.com.library.DTO.Reader;

public class LecturerBUS {
    public static int insertLecturer(Lecturer lecturer,Reader reader) throws Exception{
        MyConnectUnit connect = new MyConnectUnit(); 
        LecturerDAL.insertLecture(reader, lecturer);
        return 0;
    }
    public static int updateLecturer(Lecturer lecturer,Reader reader) throws Exception{
        MyConnectUnit connect = new MyConnectUnit(); 
        LecturerDAL.updateLecture(reader, lecturer);
        return 0;
    }
}
