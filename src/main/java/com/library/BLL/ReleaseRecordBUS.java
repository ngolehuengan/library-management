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
        public Vector getTable() {
        return new ReleaseRecordDAO().getTable();
    }

    public Vector getHeader() {
        Vector header = new Vector();
        header.add("STT");
        header.add("NGÀY NHẬP HÓA ĐƠN");
        header.add("MÃ HÓA ĐƠN");
        header.add("TỔNG SỐ LƯỢNG");
        header.add("THỦ THƯ");
        return header;
    }

    public Vector getDetailTable(int id) {
        return new ReleaseRecordDAO().getDetailTable(id);
    }
    
    public Vector getDetailHeader() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("SỐ LƯỢNG");
        return header;
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