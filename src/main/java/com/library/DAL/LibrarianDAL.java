package main.java.com.library.DAL;

import java.sql.ResultSet;
import java.util.ArrayList;

import main.java.com.library.BLL.AccountBUS;
import main.java.com.library.BLL.PersonalInfoBUS;
import main.java.com.library.DTO.Account;
import main.java.com.library.DTO.Librarian;
import main.java.com.library.DTO.PersonalInfo;

public class LibrarianDAL {
    MyConnectUnit connect;
    public boolean insertLibrarian(Account account,PersonalInfo info){
        connect = new MyConnectUnit();
        try {
            ResultSet results = connect.excuteQuery("CALL SP_Librarian_Insert("+"\""+info.getCitizenID()+"\""+","+account.getUsername()+");");
        } catch (Exception e) {
            
        }
        return true;
    }
    public boolean updateLibrarian(Account account,PersonalInfo info) throws Exception{
        AccountBUS acc = new AccountBUS();
        PersonalInfoDAL.updatePersonal(info);
        acc.updateAccount(account);
        return true;
    }

    public boolean storeLibrarian(Librarian librarian){
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_READER_UpdateHide("+librarian.getID()+","+"true"+");");
        } catch (Exception e) {
            // TODO: handle exception
        }
        return true;
    }

    public boolean reStoreLibrarian(){
        return true;
    }

    public boolean deleteLibrarian(){
        return true;
    }

    public static void updateHide(Librarian librarian) {
    }

    public  ArrayList Find_librarian(String condition) {
        connect = new MyConnectUnit();
        ArrayList<Object> rs = new ArrayList<Object>();
        ArrayList<PersonalInfo> infoList =new ArrayList<PersonalInfo>();
        ArrayList<Integer> IDList = new ArrayList<Integer>();
        ArrayList<Account> AccList = new ArrayList<Account>(0);
        try {
            ResultSet results = connect.excuteQuery("CALL Find_Librarian("+condition+")"+";");
            

        } catch (Exception e) {
            
        }
        return null;
    }
}
