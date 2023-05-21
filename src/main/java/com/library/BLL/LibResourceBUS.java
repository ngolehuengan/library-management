package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.LibResourceDAO;
import main.java.com.library.DTO.LibResource;

/**
 *
 * @author ant1006
 */
public class LibResourceBUS {
    
// -----------------------------------------------------------------------------
    public Vector<LibResource> getTable() {
        return new LibResourceDAO().getAll();
    }

// -----------------------------------------------------------------------------
    public String delete(LibResource e) {
        if (e.getTotalQuantity() != 0) {
            return "Số lượng > 0. Không thể xoá!";
        }
        if (new LibResourceDAO().delete(e.getID())) {
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
    public boolean edit(int id, boolean newData) {
        return new LibResourceDAO().updateBorrowable(id, newData);
    }
}
