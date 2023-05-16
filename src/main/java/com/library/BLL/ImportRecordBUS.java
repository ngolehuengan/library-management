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
    public Vector getTable() {
        return new ImportRecordDAO().getTable();
    }

    public Vector getHeader() {
        Vector header = new Vector();
        header.add("STT");
        header.add("NGÀY NHẬP HÓA ĐƠN");
        header.add("MÃ HÓA ĐƠN");
        header.add("TỔNG GIÁ TRỊ");
        header.add("TỔNG SỐ LƯỢNG");
        header.add("THỦ THƯ");
        return header;
    }

    public Vector getDetailTable(int id) {
        return new ImportRecordDAO().getDetailTable(id);
    }
    
    public Vector getDetailHeader() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("GIÁ TRỊ ĐƠN");
        header.add("SỐ LƯỢNG");
        return header;
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
