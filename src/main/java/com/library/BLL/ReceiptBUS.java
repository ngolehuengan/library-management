package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.ReceiptDAO;
import main.java.com.library.DTO.Receipt;

/**
 *
 * @author ant1006
 */
public class ReceiptBUS {

// -----------------------------------------------------------------------------
    public Vector<Receipt> getTable() {
        return new ReceiptDAO().getAll();
    }

// -----------------------------------------------------------------------------
//    xoá thành công ? cộng lại số nợ cho độc giả
    public String delete(Receipt e) {
        if (new ReceiptDAO().delete(e.getID())) {
            e.getReaderID() 
            e.getProceeds() tiền thu
            new ReaderDAO().
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
//    thu thành công ? cập nhật nợ tồn mới cho độc giả
    public String add(Receipt e) {
        if (new ReceiptDAO().insert(e)) {
            e.getReaderID() 
            e.getProceeds() tiền thu
            new ReaderDAO()
            return "Lưu thành công!";
        }
        return "Thất bại!";
    }
}
