package main.java.com.library.BLL;

import java.sql.Date;

/**
 *
 * @author ant1006
 */
public class Check {

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
