package main.java.com.library.BLL;

import main.java.com.library.DTO.Account;

import java.time.Instant;
import java.util.Vector;

import main.java.com.library.DAL.AccountDAL;


public class AccountBUS {
    public static Vector login(Account account) throws Exception {
        Vector<Integer> login = new Vector<>();
        // Check username for accented characters
        // String username = account.getUsername();
        // boolean hasAccent = username.matches(".*[éèêëàáâäæãåā].*");
        // if (hasAccent) {
        //     throw new Exception("Username contains accented characters");
        // }
        
        // // Check username length
        // int maxUsernameLength = 20;
        // if (username.length() > maxUsernameLength) {
        //     throw new Exception("Username is too long");
        // }
        AccountDAL AccountDAL = new AccountDAL();
        login = AccountDAL.login(account);
        return login;
    }
// true if complete
// false if can't create account
    public boolean createAccount(Account account) throws Exception{
        AccountDAL Account = new AccountDAL();
        return Account.insertAccount(account);
    }


    public boolean updateAccount(Account account) throws Exception{
        AccountDAL Account = new AccountDAL();
        return Account.updateAccount(account);
    }
    



    public boolean storeAccount(Account account) throws Exception{
        AccountDAL Account = new AccountDAL();
        return Account.storeAccount(account);
    }

    public boolean reStoreAccount(Account account) throws Exception{
        AccountDAL Account = new AccountDAL();
        return Account.reStoreAccount(account);
    }

    public boolean deleteAccount(Account account) throws Exception{
        AccountDAL Account = new AccountDAL();
        return Account.deleteAccount(account);
    }
    public static void main(String[] args) throws Exception {
        AccountBUS acc = new AccountBUS();
        Account taiKhoan = new Account("ghousdf", "t", 4);
        taiKhoan.setPassword("tinhcute");
        acc.updateAccount(taiKhoan);
    }
}
    


