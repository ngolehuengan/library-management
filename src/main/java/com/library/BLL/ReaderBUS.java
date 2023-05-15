package main.java.com.library.BLL;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.time.LocalDate;
import java.util.ArrayList;

import main.java.com.library.DAL.MyConnectUnit;
import main.java.com.library.DAL.PersonalInfoDAL;
import main.java.com.library.DAL.ReaderDAL;
import main.java.com.library.DTO.Lecturer;
import main.java.com.library.DTO.PersonalInfo;
import main.java.com.library.DTO.Reader;
import main.java.com.library.DTO.Student;

public class ReaderBUS {


// return -1 neu khong them thanh cong doc gia
//  viec them sv/giang vien cung se dung lai,du lieu se duoc hoan tac

    public static int insertReaderStudent(Reader reader,PersonalInfo info,Student student) throws Exception{
        // xu ly tien du lieu
        PersonalInfoDAL.insertPersonalInfo(info);
        reader.setID(ReaderDAL.insertReader(reader,info));
        StudentBUS.insertStudent(student, reader);
        return 0;
    }
    public static int insertReaderLecturer(Reader reader,PersonalInfo info,Lecturer lecturer) throws Exception{
        PersonalInfoDAL.insertPersonalInfo(info);
        reader.setID(ReaderDAL.insertReader(reader,info));
        LecturerBUS.insertLecturer(lecturer, reader);
        return 0;
    }

    public static boolean updateReaderStudent(Reader reader,PersonalInfo info,Student student) throws Exception{
        PersonalInfoDAL.updatePersonal(info);
        reader.setID(1);
        ReaderDAL.updateReader(reader,info);
        StudentBUS.updateStudent(student, reader);
        return true;
    }

    public boolean hideReader(Reader reader){
        ReaderDAL.storeReader(reader);
        return true;
    }

    public boolean deleteReader(Reader reader){
        return true;
    }
    public static String[] showDepartment(){
        
        ArrayList department = ReaderDAL.getDepartmentList();
        String[] sb = new String[department.size()];
        for(int i = 0;i<department.size();i++){
            sb[i] = (String) department.get(i);
        }
        return sb;
    }
    public static void main(String[] args) throws Exception {
        Reader reader = new Reader(); 
        PersonalInfo info = new PersonalInfo();
        reader.setReader(2, 1);
        ArrayList<Integer> wrong = info.setPersonalInfo("472683750", "Nguyễn Ngọc Bình Phương", "03/01/2004",false,"0122760402", "Bạc Liêu", "phattran@gmail.com");
        Student std = new Student();
        std.setStudent("3121410361","DCsj2","Bán trà tắc");
        reader.setReader(2, 5);
        ReaderBUS bus = new ReaderBUS();
        // bus.insertReaderStudent(reader, info, std);
        bus.updateReaderStudent(reader, info, std);
  
        
    }
}