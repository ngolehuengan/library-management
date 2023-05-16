package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.DocumentDAO;
import main.java.com.library.DAL.ReleaseRecordDAO;
import main.java.com.library.DAL.LibResourceDAO;
import main.java.com.library.DTO.Document;
import main.java.com.library.DTO.RLDetail;
import main.java.com.library.DTO.ReleaseRecord;

/**
 *
 * @author ant1006
 */
public class ReleaseRecordBUS {

// -----------------------------------------------------------------------------
    public Vector<ReleaseRecord> getTable() {
        return new ReleaseRecordDAO().getAll();
    }
    
// -----------------------------------------------------------------------------
//    xoá thành công ? giảm số lượng (tổng và hiện có)
    public String delete(ReleaseRecord e) {
        if (new ReleaseRecordDAO().delete(e.getID())) {
            for (RLDetail dt : e.getDetails()) {
                LibResourceDAO dao = new LibResourceDAO();
                dao.addTotalQuantity(dt.getDcmCode(), dt.getQuantity());
                dao.addAvailableQuantity(dt.getDcmCode(), dt.getQuantity());
            }
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
//    input: mã tài liệu (hàm tự check), số lượng (số nguyên không âm)    
    public RLDetail handleDetail(RLDetail raw) {
        Document dcm = new DocumentDAO().getByCode(raw.getDcmCode());
        if (dcm == null) {
            return null;
        }
        raw.setTitle(dcm.getTitle());
        return raw;
    }

//    thanh lý thành công ? giảm số lượng (tổng và hiện có)
    public String add(ReleaseRecord e) {
        if (new ReleaseRecordDAO().insert(e)) {
            for (RLDetail dt : e.getDetails()) {
                LibResourceDAO dao = new LibResourceDAO();
                dao.subtractTotalQuantity(dt.getDcmCode(), dt.getQuantity());
                dao.subtractAvailableQuantity(dt.getDcmCode(), dt.getQuantity());
            }
            return "Thanh lý thành công!";
        }
        return "Thất bại!";
    }
}