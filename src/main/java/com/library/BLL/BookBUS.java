package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.AuthorDAO;
import main.java.com.library.DAL.BookDAO;
import main.java.com.library.DAL.PublisherDAO;
import main.java.com.library.DTO.Author;
import main.java.com.library.DTO.Book;
import main.java.com.library.DTO.Publisher;

/**
 *
 * @author ant1006
 */
public class BookBUS {
// -----------------------------------------------------------------------------

    public Vector<Book> getTable() {
        return new BookDAO().getAll();
    }

// -----------------------------------------------------------------------------
    public String delete(Book e) {
        if (new BookDAO().delete(e.getID())) {
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
    public String edit(int id, Book e) {
        BookDAO dao = new BookDAO();
        Book pre = dao.getByID(id);
        String rs = "Đã sửa ";
        pretreatment(e);

        if (!pre.getTitle().equalsIgnoreCase(e.getTitle())) {
            if (dao.updateTitle(id, e.getTitle())) {
                rs = rs + "nhan đề, ";
            }
        }
        if (!pre.getCategory().equals(e.getCategory())) {
            if (dao.updateCategory(id, e.getCategory())) {
                rs = rs + "thể loại, ";
            }
        }
        if (!pre.getAuthor().equals(e.getAuthor())) {
            if (dao.updateAuthor(id, e.getAuthor())) {
                rs = rs + "tác giả, ";
            }
        }
        if (pre.getPublisher().getID() != e.getPublisher().getID()) {
            if (dao.updateImage(id, e.getImage())) {
                rs = rs + "NXB, ";
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
            return rs.substring(0, rs.length() - 3);
        }
    }

// -----------------------------------------------------------------------------
    public String add(Book e) {
        BookDAO dao = new BookDAO();
        pretreatment(e);

        switch (dao.objExistCheck(e)) {
            case -1: // isbn chưa tồn tại
                if (dao.insert(e))
                    return "Thêm thành công!";
                return "Thêm thất bại!";
            case 0: // isbn đã bị xoá
                Book db = dao.getByISBN(e.getISBN());
                edit(db.getID(), e);
                if (dao.recover(db.getID()))
                    return "Thêm thành công!";
                return "Thêm thất bại!";
            default: // isbn đã tồn tại
                return "ISBN đã tồn tại!";
        }
    }

// -----------------------------------------------------------------------------
// -- tiền xử lý trước khi thêm dữ liệu vào db: Check tác giả với NXB có trong db chưa, chưa có thì thêm --
    private Book pretreatment(Book e) {
        AuthorDAO atdao = new AuthorDAO();
        Vector<Author> at = e.getAuthor();
        for (Author a : at) {
            Author db = atdao.getByName(a.getName());
            if (db != null) {
                a = db;
            } else {
                atdao.insert(a);
                a = atdao.getByName(a.getName());
            }
        }
        e.setAuthor(at);

        PublisherDAO plsdao = new PublisherDAO();
        Publisher pls = e.getPublisher();
        Publisher db = plsdao.getByName(pls.getName());
        if (db != null) {
            pls = db;
        } else {
            plsdao.insert(pls);
            pls = plsdao.getByName(pls.getName());
        }
        e.setPublisher(pls);
        return e;
    }
}
