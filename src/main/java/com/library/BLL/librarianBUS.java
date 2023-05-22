package main.java.com.library.BLL;

import java.util.ArrayList;

import main.java.com.library.DAL.LibrarianDAL;
import main.java.com.library.DAL.PersonalInfoDAL;
import main.java.com.library.DTO.Account;
import main.java.com.library.DTO.Librarian;
import main.java.com.library.DTO.PersonalInfo;

public class librarianBUS {
    public static boolean insertLibrarian(Account account,PersonalInfo info) throws Exception{
        LibrarianDAL librarianDAL = new LibrarianDAL();
        PersonalInfoDAL.insertPersonalInfo(info);
        AccountBUS.createAccount(account);
        librarianDAL.insertLibrarian(account, info);
        return true;
    }

    public static boolean updateStudent(Account account,PersonalInfo info) throws Exception{
        LibrarianDAL librarianDAL = new LibrarianDAL();
        PersonalInfoDAL.updatePersonal(info);
        return true;
    }
    public static boolean updateHide(Librarian librarian){
        LibrarianDAL librarianDAL = new LibrarianDAL();
        librarianDAL.storeLibrarian(librarian);
        return true;
    }
    public static String[][] Table(ArrayList<PersonalInfo> info,ArrayList<Integer> id,ArrayList<Account> acc){   
        String[][] results = new String[info.size()][4];
        int row = 0;
        for(PersonalInfo i : info){
            results[row][0] = Integer.toString(id.get(row));
            results[row][1] = i.getFullName();
            results[row][2] = acc.get(row).getUsername();
            results[row][3] = i.getCitizenID();
            results[row][4] = i.getEmail();
        }
        return results;
    }
    // public static String[][] showTable(String condition){
    //     String[][] results = new String[0][0];
    //     ArrayList list = LibrarianDAL.Find_librarian(condition);
    //     results = Table(((PersonalInfo)list.get(0)),((Integer)list.get(1)),((Account)list.get(2)));
    //     return results;

    // }
    
}
