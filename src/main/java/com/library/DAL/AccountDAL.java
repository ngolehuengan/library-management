package main.java.com.library.DAL;

import main.java.com.library.DTO.Account;
import java.io.EOFException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;


/**
 * AccountDTO
 */
public class AccountDAL {
    MyConnectUnit connect;
    
    //insertAccount function to use Procedure SP_Account_Insert to insert new account
    //return 1 if add complete 0 if duplicate account
    // 

    // 
    // 
    // 
    public boolean insertAccount(Account account) throws Exception {
        connect = new MyConnectUnit();
    try {
        ResultSet result = connect.excuteQuery("CALL SP_Account_Insert(\""+account.getUsername()+"\",\""+account.getPassword()+"\","+Integer.toString(account.getRole())+");");
        return true;
    } catch (Exception e) {
        return false;
    } finally{
        connect.Close();
    }

    }
    // 
    // 
    // 
    public boolean updateAccount(Account account) throws Exception {
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_Account_UpdateAccount(\""+account.getUsername()+"\",\""+account.getPassword()+"\","+Integer.toString(account.getRole())+");");
            result.next();
            return result.getBoolean(1);
        } catch (Exception e) {
            throw new Exception("Errol"+e.getMessage());
        } finally{
            connect.Close();
        }
        
    }
    // 
    // 
    // 
    public boolean storeAccount(Account account) throws Exception {
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("Call SP_Account_UpdateHide(\""+account.getUsername()+"\""+",true);");
            result.next();
            return result.getBoolean(1);
        } catch (Exception e) {
            throw new Exception("Errol"+e.getMessage());
        }
    }
    // 
    // 
    // 
    public boolean reStoreAccount(Account account) throws Exception{
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("Call SP_Account_UpdateHide(\""+account.getUsername()+"\""+",false);");
            result.next();
            return result.getBoolean(1);
        } catch (Exception e) {
            throw new Exception("Errol"+e.getMessage());
        }
    }
    // 
    // 
    // 
    public boolean deleteAccount(Account account) throws Exception{
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("Call SP_Account_Delete(\""+account.getUsername()+"\");");
            result.next();
            return result.getBoolean(1);
        } catch (Exception e) {
            throw new Exception("Errol"+e.getMessage());
        }
    }
    // login return vector integer account_id and role(if any)
    // use procedure SP_Account_Login(userName,Password_hash)
    // 
    public Vector login(Account account) throws Exception{
        connect = new MyConnectUnit();
        Vector<Integer> login = new Vector<>();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_Account_Login("+"\""+account.getUsername()+"\","+"\""+account.getPassword()+"\");");
            result.next();
            login.add(result.getInt(1));
            if(login.get(0) == 0){
                return login;
            }
            login.add(result.getInt(2));
            
        } catch (Exception e) {
            throw new Exception("Errol"+e.getMessage());
        }
        return login;
    }
    //admin to get all account
    public ArrayList<Account> getAccount(int role){
        MyConnectUnit connect = new MyConnectUnit();
        ArrayList<Account> listAccount = new ArrayList<Account>();

        try {
            ResultSet results = connect.excuteQuery("CALL SP_Account_Select("+Integer.toString(role)+");");
            while(results.next()){
                Account account = new Account(results.getString("username"),results.getString("password"),role);
                listAccount.add(account);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        return listAccount;
    }

}   