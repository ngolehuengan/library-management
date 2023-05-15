package main.java.com.library.DTO;

import java.util.Date;

/**
 *
 * @author ant1006
 */
public class Reader {
    private int ID;             //ma doc gia
    private int classify;       //giang vien/sinh vien
    private String egistrationDate;
    private int duration ;
	private String ExpirationDate;
    private double total_debt;
    public Reader() {
        this.total_debt = 0;
    }

    public int getID(){
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getClassify() {
        return classify;
    }
    public void setClassify(int classify) {
        this.classify = classify;
    }
    public String getEgistrationDate() {
        return egistrationDate;
    }
    public void setEgistrationDate(String egistrationDate) {
        this.egistrationDate = egistrationDate;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getExpirationDate() {
        return ExpirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }
    public double getTotal_debt() {
        return total_debt;
    }
    public void setTotal_debt(double total_debt) {
        this.total_debt = total_debt;
    }

    public void setReader(int iD, int classify, String egistrationDate, int duration, String expirationDate,double total_debt) {
        ID = iD;
        this.classify = classify;
        this.egistrationDate = egistrationDate;
        this.duration = duration;
        ExpirationDate = expirationDate;
        this.total_debt = total_debt;
    }
    public void setReader(int classify,int duration){
        this.classify = classify;
        this.duration = duration;
    }
    
    
}
