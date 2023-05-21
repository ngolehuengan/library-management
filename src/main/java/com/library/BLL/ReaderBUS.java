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

    public static void updateTotalDebt(String reader_id,String fine){
        try {
            ReaderDAL.updateTotalDebt(reader_id, fine);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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

    public static String[][] showTableReader(String condition) {
        return ReaderDAL.showTableReader(condition);
    }
    public static String[][] filterTable(String[][] results,String classify,String departmentName){
        return ReaderDAL.filterResult(results, classify, departmentName);
    }

}
