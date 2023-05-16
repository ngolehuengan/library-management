package main.java.com.library.BLL;

import java.sql.Date;
import java.util.Vector;
import main.java.com.library.CONST;
import main.java.com.library.Check;
import main.java.com.library.DAL.LoanSlipDAO;
import main.java.com.library.DAL.LibResourceDAO;
import main.java.com.library.DAL.LoanDocumentDAO;
import main.java.com.library.DTO.LibResource;
import main.java.com.library.DTO.LoanDetail;
import main.java.com.library.DTO.LoanDocument;
import main.java.com.library.DTO.LoanSlip;
import main.java.com.library.DTO.ReturnDetail;
import main.java.com.library.DTO.ReturnSlip;

/**
 *
 * @author ant1006
 */
public class LoanSlipBUS {

// -----------------------------------------------------------------------------
    public Vector<LoanSlip> getTable() {
        return new LoanSlipDAO().getAll();
    }
    
    public Vector<LoanDocument> getLoanDocumentTable() {
        return new LoanDocumentDAO().getAll();
    }
    
    public Vector<LoanDocument> getBorrowing() {
        return new LoanDocumentDAO().getBorrowing();
    }
    
    public Vector<LibResource> getBorrowable() {
        return new LibResourceDAO().getAvaiResources();
    }
 
// -----------------------------------------------------------------------------
//    xoá thành công ? trả lại số lượng cũ 
    public String delete(LoanSlip e) {
        if (new LoanSlipDAO().delete(e.getID())) {
            for (LoanDetail dt : e.getDetails()) {
                new LibResourceDAO().addAvailableQuantity(dt.getDcmCode(), 1);
            }
            return "Đã xoá!";
        }
        return "Xoá thất bại!";
    }

// -----------------------------------------------------------------------------
//    input: dòng dữ liệu trên bảng mượn được    
    public LoanDetail handleDetail(LibResource raw) {
        String dcmCode = raw.getDocument().getCode();
        String title = raw.getDocument().getTitle();
        
        return new LoanDetail (dcmCode,title);
    }

//    mượn thành công ? cập nhật số lượng hiện có
    public String addLoanSlip(LoanSlip e) {
        if (new LoanSlipDAO().insert(e)) {
            for (LoanDetail dt : e.getDetails()) {
                new LibResourceDAO().subtractAvailableQuantity(dt.getDcmCode(), 1);
            }
            return "Lưu thành công!";
        }
        return "Thất bại!";
    }   

// -----------------------------------------------------------------------------
//    input: dòng dữ liệu trên bảng đang mượn + ngày trả    
    public ReturnDetail handleDetail(LoanDocument raw, Date returnDate) {
        int loanDcmID = raw.getID();
        String dcmCode = raw.getDocument().getCode();
        String title = raw.getDocument().getTitle();
        int overdue = Check.getDateDistance(raw.getAppointmentDate(), returnDate);
        double fine = overdue * CONST.FINE_per_DAY;
        return new ReturnDetail(loanDcmID,dcmCode,title,overdue,fine);
    }

//    thêm ngày trả (phiếu trả), nợ (chi tiết trả), người tiếp nhận (phiếu trả) vào TÀI LIỆU MƯỢN (chi tiết trả)
//    trả thành công ? hoàn lại số tài nguyên có sẵn, cộng nợ độc giả
    public String addReturnSlip(ReturnSlip e) {
        Date returnDate = e.getDate();
        int librarianID = e.getLibrarianID();
        LoanDocumentDAO dao = new LoanDocumentDAO();
        for (ReturnDetail dt : e.getDetails()) {
            int loanDcmID = dt.getLoanDcmID(); // tài liệu mượn
            dao.updateReturnDate(loanDcmID, returnDate);
            dao.updateFine(loanDcmID, dt.getFine());
            dao.updateLibrarianID(loanDcmID, librarianID);
            
            new LibResourceDAO().addAvailableQuantity(dt.getDcmCode(), 1);
            ReaderBUS.updateTotalDebt(e.getReaderID(),dt.getFine());
        }
        return "Đã trả thành công!";
    }
    
// -----------------------------------------------------------------------------
//    mượn thành công ? cập nhật số lượng hiện có
    public String adjourn(LoanDocument e) {
        if (e.isAdjourned()) {
            return "Không thể gia hạn tiếp!";
        }
        new LoanDocumentDAO().updateAppointmentDate(e.getID(), Check.adjournDate(e.getAppointmentDate()));
        return "Đã gia hạn!";
    }
    
}
