package DAL;

import DTO.User;

/**
 *
 * @author ant1006
 */
public class DAOUser extends ConnectDB {
    public boolean insert(User element) {
        return true;
    }
    
    public boolean update(String username, User element) {
        return true;
    }
    
    public boolean delete(User element) {
        return true;
    }
    
    public User login(String username, String password) {
        User user = null;
        try {
            
        } catch (Exception e) {}
        return user;
    }
}
