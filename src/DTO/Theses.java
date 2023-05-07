package DTO;

import java.util.Vector;

/**
 *
 * @author ant1006
 */
public class Theses extends Document {

    private Vector<Author> author = new Vector<>();   
    private Specialized specialized; 
    private int defenseYear; //năm bảo vệ

    public Theses(String title, Vector<Author> author, Specialized specialized, int defenseYear, String description, String image) {
        super(title, description, image);
        this.author = author;
        this.specialized = specialized;
        this.defenseYear = defenseYear;
    }

    public Theses(int ID, String code, String title, Specialized specialized, int defenseYear, String description, String image) {
        super(ID, code, title, description, image);
        this.specialized = specialized;
        this.defenseYear = defenseYear;
    }

    public Vector<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Vector<Author> author) {
        this.author = author;
    }

    public Specialized getSpecialized() {
        return specialized;
    }

    public void setSpecialized(Specialized specialized) {
        this.specialized = specialized;
    }

    public int getDefenseYear() {
        return defenseYear;
    }

    public void setDefenseYear(int defenseYear) {
        this.defenseYear = defenseYear;
    }

}
