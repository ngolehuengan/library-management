package main.java.com.library.DTO;

import java.util.Objects;
import java.util.Vector;

/**
 * 
 * @author ant1006
 */
public class Book extends Document {

    private String ISBN;    
    private Vector<Category> category = new Vector<>();
    private Vector<Author> author = new Vector<>();   
    private Publisher publisher;                    
    private int publishingYear;
    
    public Book() {
        super();
    }

    public Book(String ISBN, String title, Vector<Category> category, Vector<Author> author, Publisher publisher, int publishingYear, String description, String image) {
        super(title, description, image);
        this.ISBN = ISBN;
        this.category = category;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
    }

    public Book(int ID, String code, String ISBN, String title, Publisher publisher, int publishingYear, String description, String image) {
        super(ID, code, title, description, image);
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" + "ID=" + ID + ", code=" + code + ", ISBN=" + ISBN + ", title=" + title + ", category=" + category + ", author=" + author + ", publisher=" + publisher + ", publishingYear=" + publishingYear + ", description=" + description + ", image=" + image + '}';
    }    
}
