package DTO;

/**
 *
 * @author ant1006
 */
public class Specialized {

    private int ID;
    private String code;
    private String name;

    public Specialized() {
    }

    public Specialized(String name) {
        this.name = name;
    }

    
    public Specialized(int ID, String code, String name) {
        this.ID = ID;
        this.code = code;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
