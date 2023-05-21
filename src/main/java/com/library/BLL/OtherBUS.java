package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.OtherDAO;
import main.java.com.library.DTO.Other;

/**
 *
 * @author ant1006
 */
public class OtherBUS {
    
// -----------------------------------------------------------------------------
    public Vector<Other> getTable() {
        return new OtherDAO().getAll();
    }

// -----------------------------------------------------------------------------
    public String delete(Other e) {
        if (new OtherDAO().delete(e.getID())) {
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
    public String edit(int id, Other e) {
        OtherDAO dao = new OtherDAO();
        Other pre = dao.getByID(id);
        String rs = "Đã sửa ";
        
        if (!pre.getTitle().equalsIgnoreCase(e.getTitle())) {
            if (dao.updateTitle(id, e.getTitle())) {
                rs = rs + "nhan đề, ";
            }
        }
        if (!pre.getDescription().equalsIgnoreCase(e.getDescription())) {
            if (dao.updateDescription(id, e.getDescription())) {
                rs = rs + "mô tả, ";
            }
        }
        if (!pre.getImage().equals(e.getImage())) {
            if (dao.updateImage(id, e.getImage())) {
                rs = rs + "ảnh, ";
            }
        }

        if (rs.equals("Đã sửa ")) {
            return "Sửa thất bại!";
        } else {
            return rs.substring(0, rs.length() - 2);
        }
    }

// -----------------------------------------------------------------------------
    public String add(Other e) {
        OtherDAO dao = new OtherDAO();

        switch (dao.objExistCheck(e)) {
            case -1: // chưa tồn tại
                if (dao.insert(e))
                    return "Thêm thành công!";
                return "Thêm thất bại!";
            case 0: // đã bị xoá
                Other db = dao.getByDTO(e);
                edit(db.getID(), e);
                if (dao.recover(db.getID()))
                    return "Thêm thành công!";
                return "Thêm thất bại!";
            default: // đã tồn tại
                return "Ấn phẩm đã tồn tại!";
        }
    }
}
