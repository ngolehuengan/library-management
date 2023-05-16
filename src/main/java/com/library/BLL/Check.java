package main.java.com.library;

import java.sql.Date;

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
        return true;
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

    public static boolean isInteger(String text) {
        try {
            Integer.parseInt(text);
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
}
