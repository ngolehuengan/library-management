package main.java.com.library.GUI.components;

import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class TableHeader {

    /*---- QUẢN LÝ KHO - MANAGE INVENTORY --*/
    public static Vector importRecord() {
        Vector header = new Vector();
        header.add("STT");
        header.add("NGÀY NHẬP HÓA ĐƠN");
        header.add("MÃ HÓA ĐƠN");
        header.add("TỔNG GIÁ TRỊ");
        header.add("TỔNG SỐ LƯỢNG");
        header.add("THỦ THƯ");
        return header;
    }

    public static Vector importDetail() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("GIÁ TRỊ ĐƠN");
        header.add("SỐ LƯỢNG");
        return header;
    }

    public static Vector releaseRecord() {
        Vector header = new Vector();
        header.add("STT");
        header.add("NGÀY NHẬP HÓA ĐƠN");
        header.add("MÃ HÓA ĐƠN");
        header.add("TỔNG SỐ LƯỢNG");
        header.add("THỦ THƯ");
        return header;
    }

    public static Vector releaseDetail() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("SỐ LƯỢNG");
        return header;
    }

    /*---- QUẢN LÝ TÀI LIỆU - MANAGE BOOK --*/
    public static Vector allDocument() {
        Vector header = new Vector();
        header.add("STT");
        header.add("LOẠI TÀI LIỆU");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("GIÁ TRỊ");
        header.add("SỐ LƯỢNG");
        header.add("SỐ CÓ SẴN");
        header.add("MƯỢN ĐƯỢC");
        return header;
    }

    public static Vector book() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("ISBN");
        header.add("NHAN ĐỀ");
        header.add("THỂ LOẠI");
        header.add("TÁC GIẢ");
        header.add("NXB");
        header.add("NĂM XB");
        header.add("MÔ TẢ");
        return header;
    }

    public static Vector copy() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("THỂ LOẠI");
        header.add("TÁC GIẢ");
        header.add("NĂM XB");
        header.add("MÔ TẢ");
        return header;
    }

    public static Vector theses() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("TÁC GIẢ");
        header.add("CHUYÊN NGÀNH");
        header.add("NĂM BẢO VỆ");
        header.add("MÔ TẢ");
        return header;
    }

    public static Vector other() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("MÔ TẢ");
        return header;
    }

    /*---- QUẢN LÝ DỊCH VỤ - MANAGE SERVICE --*/
    public static Vector borrow() {
        Vector header = new Vector();
        header.add("STT");
        header.add("LOẠI TÀI LIỆU");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("SỐ LƯỢNG");
        header.add("SỐ CÓ SẴN");
        return header;
    }

    public static Vector borrowDetail() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        return header;
    }

    public static Vector returnn() {
        Vector header = new Vector();
        header.add("STT");
        header.add("NGÀY MƯỢN");
        header.add("NGÀY HẸN TRẢ");
        header.add("NGƯỜI MƯỢN");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("GIA HẠN");
        return header;
    }

    public static Vector returnDetail() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("SỐ NGÀY QUÁ HẠN");
        header.add("TIỀN PHẠT");
        return header;
    }

    public static Vector debtor() {
        Vector header = new Vector();
        header.add("STT");
        header.add("ĐỘC GIẢ");
        header.add("TIỀN NỢ");
        return header;
    }

    /*---- HOẠT ĐỘNG - SLIP --*/
    public static Vector borrowHistory() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ PHIẾU");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("ĐỘC GIẢ");
        header.add("NGÀY MƯỢN");
        header.add("NGÀY HẸN TRẢ");
        header.add("NGÀY TRẢ");
        header.add("TIỀN PHẠT");
        header.add("NGƯỜI TIẾP NHẬN");
        return header;
    }

    public static Vector loanSlip() {
        Vector header = new Vector();
        header.add("STT");
        header.add("NGƯỜI TIẾP NHẬN");
        header.add("MÃ PHIẾU");
        header.add("ĐỘC GIẢ");
        header.add("NGÀY MƯỢN");
        header.add("NGÀY HẸN TRẢ");
        header.add("TỔNG SỐ LƯỢNG");
        header.add("SỐ ĐÃ TRẢ");
        return header;
    }

    public static Vector loanDetail() {
        Vector header = new Vector();
        header.add("STT");
        header.add("MÃ TÀI LIỆU");
        header.add("NHAN ĐỀ");
        header.add("ĐÃ TRẢ");
        return header;
    }

    public static Vector penaltyRecord() {
        Vector header = new Vector();
        header.add("STT");
        header.add("NGÀY");
        header.add("MÃ BIÊN BẢN");
        header.add("ĐỘC GIẢ");
        header.add("NỘI DUNG");
        header.add("HƯỚNG XỬ LÝ");
        header.add("TIỀN PHẠT");
        header.add("NGƯỜI XỬ LÝ");
        return header;
    }

    public static Vector receipt() {
        Vector header = new Vector();
        header.add("STT");
        header.add("NGÀY");
        header.add("MÃ BIÊN LAI");
        header.add("ĐỘC GIẢ");
        header.add("TIỀN THU");
        header.add("NGƯỜI XỬ LÝ");
        return header;
    }

}
