package main.java.com.library.BLL;

import java.sql.Date;
import java.text.ParseException;

/**
 *
 * @author ant1006
 */
public class Check {

//    Tính ngày mới sau khi gia hạn theo hằng số 
    public static Date adjournDate(Date old) {
        return new Date(System.currentTimeMillis());
    }

//    Tính số ngày từ start đến end    
    public static int getDateDistance(Date start, Date end) {
        return 0;
    }

    public static boolean isISBN(String text) {
        if (text.length() == 13) {
            if (isLong(text)) {
                return true;
            }
        }
        return false;
    }

//    yyyy-MM-dd
    public static boolean isDate(String text) {
        try {
            Date.valueOf(text);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isDateF(String text) {
        try {
            java.util.Date dt = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(text);
            if (dt.after(new java.util.Date(System.currentTimeMillis()))) {
                return true;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean isInteger(String text) {
        try {
            if (Integer.parseInt(text) >= 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isLong(String text) {
        try {
            Long.parseLong(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isDouble(String text) {
        try {
            Double.parseDouble(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isDcmCode(String text) {
        if (text.length() == 7) {
            if (text.contains("BK") || text.contains("CP") || text.contains("TH") || text.contains("OT")) {
                if (isInteger(text.substring(2))) {
                    return true;
                }
            }
        }
        return false;
    }
}
