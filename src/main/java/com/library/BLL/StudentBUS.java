package main.java.com.library.BLL;

import main.java.com.library.DAL.MyConnectUnit;
import main.java.com.library.DAL.StudentDAL;
import main.java.com.library.DTO.Reader;
import main.java.com.library.DTO.Student;

public class StudentBUS {

    // xu ly tren gui truoc khi dua vao dto
    // return 1 : lớp quá dài (quá 10 kí tự)

    public static int insertStudent(Student student,Reader reader) throws Exception{
        MyConnectUnit connect = new MyConnectUnit();
        StudentDAL.insertStudent(reader, student);
        return 0;
    }
    public static int updateStudent(Student student,Reader reader) throws Exception{
        MyConnectUnit connect = new MyConnectUnit();
        StudentDAL.updateStudent(reader,student);
        return 0;
    }
}
