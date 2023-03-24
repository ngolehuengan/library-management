package DAL;

import DTO.Account;

/**
 *
 * @author ant1006
 */
public class DAOUser extends ConnectDB {
    public boolean insert(Account element) {
        return true;
    }
    
    public boolean update(String username, Account element) {
        return true;
    }
    
    public boolean delete(Account element) {
        return true;
    }
    
    public Account login(String username, String password) {
        Account user = null;
        try {
            
        } catch (Exception e) {}
        return user;
    }
}
