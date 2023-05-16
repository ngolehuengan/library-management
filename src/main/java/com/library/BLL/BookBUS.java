package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.AuthorDAO;
import main.java.com.library.DAL.BookDAO;
import main.java.com.library.DAL.PublisherDAO;
import main.java.com.library.DTO.Author;
import main.java.com.library.DTO.Book;
import main.java.com.library.DTO.Category;
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
            return rs.substring(0, rs.length() - 2);
        }
    }

// -----------------------------------------------------------------------------
    public String add(Book e) {
        BookDAO dao = new BookDAO();
        e = pretreatment(e);

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
    
// -----------------------------------------------------------------------------
        
    public static void main (String[] args) {
//        BookBUS bus = new BookBUS();
//        Vector<Book> vt = bus.getTable();
//        for (int i = 0; i < vt.size(); i++) {
//            System.out.println(vt.get(i).toString());
//        }
        
//        System.out.println(bus.delete(vt.get(1)));
        
//        Book e = vt.get(0);
//        Vector<Author> at = new Vector<>();
//        at.add(new Author("Tô Hoài"));
//        e.setAuthor(at);
//        
//        System.out.println(bus.edit(e.getID(),e));

//        Book e = new Book();
//        e.setISBN("9786047796887");
//        e.setTitle("Truyện Kiều");
//        Vector<Category> ct = new Vector<>();
//        ct.add(new Category(10,"Thơ"));
//        e.setCategory(ct);
//        Vector<Author> at = new Vector<>();
//        at.add(new Author("Nguyễn Du"));
//        e.setAuthor(at);
//        e.setPublisher(new Publisher("NXB HOI NHA VAN"));
//        e.setPublishingYear(2021);
//        e.setDescription("Một trong những tác phẩm văn học lớn nhất của Việt Nam, kể về câu chuyện tình cảm của Kiều với Thúy Vân");
//        e.setImage("/anh_bia/truyen_kieu");
//        System.out.println(bus.add(e));
    }
}
