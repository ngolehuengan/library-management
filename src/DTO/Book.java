package DTO;

import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class Book {
    private String ISBN;                        //PK
    private String tittle;
    private Vector<String> categoriesID = null; //FK
    private Vector<String> authorsID = null;    //FK
    private String publisher;                   //FK
    private int publishingYear;
    private String sysnopsis; //tóm tắt nội dung
    private float price; //cập nhật mới nhất
    private int quanlity; //tổng số lượng
    private boolean rentable = true;    //cho phép mượn về
    private boolean exists = true;      //đang hiện hữu

    
}
