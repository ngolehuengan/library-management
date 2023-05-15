package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.AuthorDAO;
import main.java.com.library.DAL.ThesesDAO;
import main.java.com.library.DAL.SpecializedDAO;
import main.java.com.library.DTO.Author;
import main.java.com.library.DTO.Theses;
import main.java.com.library.DTO.Specialized;

/**
 *
 * @author ant1006
 */
public class ThesesBUS {
    
// -----------------------------------------------------------------------------
    public Vector<Theses> getTable() {
        return new ThesesDAO().getAll();
    }

// -----------------------------------------------------------------------------
    public String delete(Theses e) {
        if (new ThesesDAO().delete(e.getID())) {
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
    public String edit(int id, Theses e) {
        ThesesDAO dao = new ThesesDAO();
        Theses pre = dao.getByID(id);
        String rs = "Đã sửa ";
        e = pretreatment(e);
        
        if (!pre.getTitle().equalsIgnoreCase(e.getTitle())) {
            if (dao.updateTitle(id, e.getTitle())) {
                rs = rs + "nhan đề, ";
            }
        }
        if (!authorEquals(pre.getAuthor(),e.getAuthor())) {
            if (dao.updateAuthor(id, e.getAuthor())) {
                rs = rs + "tác giả, ";
            }
        }
        if (pre.getSpecialized().getID() != e.getSpecialized().getID()) {
            if (dao.updateImage(id, e.getImage())) {
                rs = rs + "NXB, ";
            }
        }
        if (pre.getDefenseYear() != e.getDefenseYear()) {
            if (dao.updateDefenseYear(id, e.getDefenseYear())) {
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
    public String add(Theses e) {
        ThesesDAO dao = new ThesesDAO();
        e = pretreatment(e);

        switch (dao.objExistCheck(e)) {
            case -1: // chưa tồn tại
                if (dao.insert(e))
                    return "Thêm thành công!";
                return "Thêm thất bại!";
            case 0: // đã bị xoá
                Theses db = dao.getByDTO(e);
                edit(db.getID(), e);
                if (dao.recover(db.getID()))
                    return "Thêm thành công!";
                return "Thêm thất bại!";
            default: // đã tồn tại
                return "Luận văn đã tồn tại!";
        }
    }

// -----------------------------------------------------------------------------
// -- tiền xử lý trước khi thêm dữ liệu vào db: Check tác giả với chuyên ngành có trong db chưa, chưa có thì thêm --
    private Theses pretreatment(Theses e) {
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

        SpecializedDAO spcldao = new SpecializedDAO();
        Specialized spcl = e.getSpecialized();
        Specialized db = spcldao.getByCode(spcl.getCode());
        if (db != null) {
            spcl = db;
        } else {
            spcldao.insert(spcl);
            spcl = spcldao.getByCode(spcl.getCode());
        }
        e.setSpecialized(spcl);
        return e;
    }

// -- check so sánh --
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
