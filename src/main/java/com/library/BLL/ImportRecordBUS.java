package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.DocumentDAO;
import main.java.com.library.DAL.ImportRecordDAO;
import main.java.com.library.DAL.LibResourceDAO;
import main.java.com.library.DTO.Document;
import main.java.com.library.DTO.IPDetail;
import main.java.com.library.DTO.ImportRecord;
import main.java.com.library.DTO.LibResource;

/**
 *
 * @author ant1006
 */
public class ImportRecordBUS {

// -----------------------------------------------------------------------------
    public Vector<ImportRecord> getTable() {
        return new ImportRecordDAO().getAll();
    }

// -----------------------------------------------------------------------------
//    xoá thành công ? giảm số lượng (tổng và hiện có)
    public boolean delete(ImportRecord e) {
        LibResourceDAO dao = new LibResourceDAO();
        for (IPDetail dt : e.getDetails()) {
            if (dt.getQuantity() > dao.getByCode(dt.getDcmCode()).getAvailableQuantity()) {
                return false;
            }
        }
        
        if (new ImportRecordDAO().delete(e.getID())) {
            for (IPDetail dt : e.getDetails()) {
                dao.subtractTotalQuantity(dt.getDcmCode(), dt.getQuantity());
                dao.subtractAvailableQuantity(dt.getDcmCode(), dt.getQuantity());
            }
            return true;
        }
        return false;
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

//    nhập thành công ? Tài liệu cũ: cập nhật giá mới và tăng số lượng (tổng và hiện có). Tài liệu mới: Thêm hồ sơ
    public String add(ImportRecord e) {
        if (new ImportRecordDAO().insert(e)) {
            for (IPDetail dt : e.getDetails()) {
                LibResourceDAO dao = new LibResourceDAO();
                LibResource rs = new LibResourceDAO().getByCode(dt.getDcmCode());
                if (rs != null) {
                    dao.updatePrice(dt.getDcmCode(), dt.getPrice());
                    dao.addTotalQuantity(dt.getDcmCode(), dt.getQuantity());
                    dao.addAvailableQuantity(dt.getDcmCode(), dt.getQuantity());
                } else {
                    rs = new LibResource(new DocumentDAO().getByCode(dt.getDcmCode()),dt.getPrice(),dt.getQuantity());
                    dao.insert(rs);
                }
            }
            return "Nhập thành công!";
        }
        return "Thất bại!";
    }
}
