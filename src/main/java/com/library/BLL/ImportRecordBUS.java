package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.DocumentDAO;
import main.java.com.library.DAL.ImportRecordDAO;
import main.java.com.library.DAL.LibResourceDAO;
import main.java.com.library.DTO.Document;
import main.java.com.library.DTO.IPDetail;
import main.java.com.library.DTO.ImportRecord;

/**
 *
 * @author ant1006
 */
public class ImportRecordBUS {

// -----------------------------------------------------------------------------
    public Vector getAll() {
        return new ImportRecordDAO().getAll();
    }

    public Vector getDisplayTable() {
        return new ImportRecordDAO().getTable();
    }
    
    public Vector getDetailTable(int id) {
        return new ImportRecordDAO().getDetailTable(id);
    }
    
// -----------------------------------------------------------------------------
//    xoá thành công ? giảm số lượng (tổng và hiện có)
    public String delete(ImportRecord e) {
        if (new ImportRecordDAO().delete(e.getID())) {
            for (IPDetail dt : e.getDetails()) {
                LibResourceDAO dao = new LibResourceDAO();
                dao.subtractTotalQuantity(dt.getDcmCode(), dt.getQuantity());
                dao.subtractAvailableQuantity(dt.getDcmCode(), dt.getQuantity());
            }
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
//    input: mã tài liệu (hàm tự check), giá trị (số thực không âm), số lượng (số nguyên không âm)    
    public IPDetail handleDetail(IPDetail raw) {
        Document dcm = new DocumentDAO().getByCode(raw.getDcmCode());
        if (dcm == null) {
            return null;
        }
        raw.setTitle(dcm.getTitle());
        return raw;
    }

//    nhập thành công ? cập nhật giá mới và tăng số lượng (tổng và hiện có)
    public String add(ImportRecord e) {
        if (new ImportRecordDAO().insert(e)) {
            for (IPDetail dt : e.getDetails()) {
                LibResourceDAO dao = new LibResourceDAO();
                dao.updatePrice(dt.getDcmCode(), dt.getPrice());
                dao.addTotalQuantity(dt.getDcmCode(), dt.getQuantity());
                dao.addAvailableQuantity(dt.getDcmCode(), dt.getQuantity());
            }
            return "Nhập thành công!";
        }
        return "Thất bại!";
    }
}
