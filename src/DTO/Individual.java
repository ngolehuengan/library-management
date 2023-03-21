package DTO;

/**
 *
 * @author ant1006
 */
public class Individual {
    private String ID;          //PK
    private String ISBN;        //FK
    private String locationID;  //FK
    private boolean available = true;   //Available in library, can be borrowed present
    private boolean exists = true;       //đang hiện hữu

}
