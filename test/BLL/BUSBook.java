package BLL;

import DAL.Document.DAOBook;
import main.java.com.library.DTO.Document.Book;
import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class BUSBook {

    private DAOBook dao = new DAOBook();

    public Vector<Book> getAllBook() {
        return dao.getAll();
    }
    
    public Book get(int id) {
        if (dao.getExistingLogic(id) == 1)
            return dao.getByID(id);
        return null;
    }
    
    public String deleteBook(int id) {
        switch (dao.getExistingLogic(id)) {
            case -1:
                return "Không tìm thấy ID!";
            case 1:
                if (!dao.deleteByID(id))
                    return "Thất bại!";
            default:
                return "Đã xoá!";
            
        }        
    }
    
    public String addBook(Book element) {
        switch (dao.getExistingLogic(element.getID())) {
            case -1:
                if (dao.insert((Book) element))
                    return "Đã thêm!";
                else
                    return "Thất bại!";
            case 1:
                return "ID đã tồn tại!";
            default:
                return "Đã xoá!";
            
        }        
    }

}
