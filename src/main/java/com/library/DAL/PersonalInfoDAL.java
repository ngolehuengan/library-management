package main.java.com.library.DAL;

import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import main.java.com.library.DTO.PersonalInfo;

public class PersonalInfoDAL {
    static MyConnectUnit connect;


    public static boolean insertPersonalInfo(PersonalInfo info) throws Exception{
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_UserInfo_Insert("+"\""+info.getCitizenID()+"\""+","+"\""+info.getFullName()+"\""+","+"\""+info.getBirthday().toString()+"\""+","+info.getisMale()+","+"\""+info.getPhoneNumber()+"\""+","+"\""+info.getAddress()+"\""+","+"\""+info.getEmail()+"\""+");");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return true;
    }

    public static boolean updatePersonal(PersonalInfo info) throws Exception{
        connect = new MyConnectUnit();
        try {
            ResultSet result = connect.excuteQuery("CALL SP_UserINFO_Update("+"\""+info.getCitizenID()+"\""+","+"\""+info.getFullName()+"\""+","+"\""+info.getBirthday().toString()+"\""+","+info.getisMale()+","+"\""+info.getPhoneNumber()+"\""+","+"\""+info.getAddress()+"\""+","+"\""+info.getEmail()+"\""+");");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return true;
    }

    public boolean storePersonal(){
        return true;
    }

    public boolean reStorePersonal(){
        return true;
    }

    public boolean deletePersonal(){
        return true;
    }
}
