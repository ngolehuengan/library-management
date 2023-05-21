package main.java.com.library.BLL;

import java.util.Vector;
import main.java.com.library.DAL.PenaltyRecordDAO;
import main.java.com.library.DTO.PenaltyRecord;

/**
 *
 * @author ant1006
 */
public class PenaltyRecordBUS {

// -----------------------------------------------------------------------------
    public Vector<PenaltyRecord> getTable() {
        return new PenaltyRecordDAO().getAll();
    }

// -----------------------------------------------------------------------------
    public String delete(PenaltyRecord e) {
        if (new PenaltyRecordDAO().delete(e.getID())) { 
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
    public String add(PenaltyRecord e) {
        if (new PenaltyRecordDAO().insert(e)) {
            return "Nhập thành công!";
        }
        return "Thất bại!";
    }
}