package main.java.com.library.BLL;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalInfoBUS {
    // 1 : Căn cước hoặc chứng minh nhân dân không hợp lệ
    private static boolean checkCitizenID(String citizenID ){
        if (citizenID.length() != 12 && citizenID.length() != 9){
            return false;
        }
        // check parse
        try {
            Long.parseLong(citizenID);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    private static boolean checkPhone(String Phone){
        if(Phone.length() != 10) return false;
        try {
            Integer.parseInt(Phone);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    private static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static ArrayList checkPersonalInfo(String citizenID, String fullName, String Birthday, String male, String phoneNumber, String Address,String email){
        ArrayList<Integer> wrongFormat = new ArrayList<Integer>();
        if(citizenID.isEmpty() || checkCitizenID(citizenID) == false) wrongFormat.add(1);
        if(fullName.isEmpty()|| fullName.length() >50) wrongFormat.add(2);
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthday = LocalDate.parse(Birthday, formatter);
            LocalDate currentDate = LocalDate.now();
            if(birthday.isAfter(currentDate)) wrongFormat.add(3);
        } catch (Exception e) {
                wrongFormat.add(3);
            
            
        }
        // 
        if(phoneNumber.isEmpty() || checkPhone(phoneNumber) == false) wrongFormat.add((4)) ;
        if (Address.isEmpty()||Address.length() > 100) wrongFormat.add(5);
        if (email.isEmpty()||checkEmail(email) == false) wrongFormat.add(6);
        return wrongFormat;
    } 
}
