package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.AuthorDAO;
import main.java.com.library.DAL.CategoryDAO;
import main.java.com.library.DAL.CopyDAO;
import main.java.com.library.DAL.PublisherDAO;
import main.java.com.library.DTO.Author;
import main.java.com.library.DTO.Copy;
import main.java.com.library.DTO.Category;

/**
 *
 * @author ant1006
 */
public class DocumentBUS {
    
// -----------------------------------------------------------------------------
    public Vector getCategory() {
        return new CategoryDAO().getAll();
    }
    
    public Vector getAuthor() {
        return new AuthorDAO().getAll();
    }
    
    public Vector getPublisher() {
        return new PublisherDAO().getAll();
    }
    
    

// -----------------------------------------------------------------------------
    public String delete(Copy e) {
        if (new CopyDAO().delete(e.getID())) {
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
    public String edit(int id, Copy e) {
        CopyDAO dao = new CopyDAO();
        Copy pre = dao.getByID(id);
        String rs = "Đã sửa ";
        e = pretreatment(e);
        
        if (!pre.getTitle().equalsIgnoreCase(e.getTitle())) {
            if (dao.updateTitle(id, e.getTitle())) {
                rs = rs + "nhan đề, ";
            }
        }
        if (!categoryEquals(pre.getCategory(),e.getCategory())) {
            if (dao.updateCategory(id, e.getCategory())) {
                rs = rs + "thể loại, ";
            }
        }
        if (!authorEquals(pre.getAuthor(),e.getAuthor())) {
            if (dao.updateAuthor(id, e.getAuthor())) {
                rs = rs + "tác giả, ";
            }
        }
        if (pre.getPublishingYear() != e.getPublishingYear()) {
            if (dao.updatePublishingYear(id, e.getPublishingYear())) {
                rs = rs + "năm XB, ";
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
    public String add(Copy e) {
        CopyDAO dao = new CopyDAO();
        e = pretreatment(e);

        switch (dao.objExistCheck(e)) {
            case -1: // chưa tồn tại
                if (dao.insert(e))
                    return "Thêm thành công!";
                return "Thêm thất bại!";
            case 0: // đã bị xoá
                Copy db = dao.getByDTO(e);
                edit(db.getID(), e);
                if (dao.recover(db.getID()))
                    return "Thêm thành công!";
                return "Thêm thất bại!";
            default: // đã tồn tại
                return "Tài liệu đã tồn tại!";
        }
    }

// -----------------------------------------------------------------------------
// -- tiền xử lý trước khi thêm dữ liệu vào db: Check tác giả có trong db chưa, chưa có thì thêm --
    private Copy pretreatment(Copy e) {
        AuthorDAO atdao = new AuthorDAO();
        Vector<Author> at = e.getAuthor();
        for (int i = 0; i < at.size(); i++) {
            Author db = atdao.getByName(at.get(i).getName());
            if (db != null) {
                at.set(i,db);
            } else {
                atdao.insert(at.get(i));
                at.set(i,atdao.getByName(at.get(i).getName()));
            }
        }
        e.setAuthor(at);
        return e;
    }

// -- check so sánh --
    private boolean categoryEquals(Vector<Category> a, Vector<Category> b) {
        if (a.size() != b.size()) 
            return false;
        int rs = 0;
        for (int i = 0; i < a.size(); i++)
            for (int j = 0; j < b.size(); j++)
                if (a.get(i).getID() == b.get(j).getID())
                    rs++;
        return (rs == a.size());
    }
    
    private boolean authorEquals(Vector<Author> a, Vector<Author> b) {
        if (a.size() != b.size()) 
            return false;
        int rs = 0;
        for (int i = 0; i < a.size(); i++)
            for (int j = 0; j < b.size(); j++)
                if (a.get(i).getID() == b.get(j).getID())
                    rs++;
        return (rs == a.size());
    }
}