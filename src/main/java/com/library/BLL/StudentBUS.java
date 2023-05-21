package main.java.com.library.BLL;

import java.util.ArrayList;

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
    public static ArrayList checkStudent(String studentID, String className, String departmentName) {
        ArrayList<Integer> wrongList = new ArrayList<Integer>();
        if(studentID.length() != 10 || studentID.isEmpty()) wrongList.add(1);
        if(className.length() >10 || className.isEmpty()) wrongList.add(2);
        if(departmentName.length() > 50 ) wrongList.add(3);

        return wrongList;
    }
    
}
