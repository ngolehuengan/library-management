package DTO;

import java.util.Vector;

/**
 * 
 * @author ant1006
 */
public class Copy extends Document {
    private Vector<Category> category = new Vector<>();
    private Vector<Author> author = new Vector<>();   
    private int publishingYear;

    public Copy(String title, Vector<Category> category, Vector<Author> author, int publishingYear, String description, String image) {
        super(title, description, image);
        this.category = category;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public Copy(int ID, String code, String title, int publishingYear, String description, String image) {
        super(ID, code, title, description, image);
        this.publishingYear = publishingYear;
    }

    @Override
    public String getCode() {
        return "CP_" + this.getID();
    }

    public Vector<Category> getCategory() {
        return category;
    }

    public void setCategory(Vector<Category> category) {
        this.category = category;
    }

    public Vector<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Vector<Author> author) {
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
