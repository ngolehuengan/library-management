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
    public String edit(int id, LibResource e) {
        LibResourceDAO dao = new LibResourceDAO();
        LibResource pre = dao.getByID(id);
        
        if (pre.isBorrowable() != e.isBorrowable()) {
            if (dao.updateBorrowable(id, e.isBorrowable())) {
                return "Lưu thay đổi!";
            }
            return "Thất bại!";
        }
        return "";
    }
}
