package Entity;

import java.util.List;

/**
 *
 * @author ant1006
 */
public class Book {
    private String ISBN;
    private String tittle;
    private List<Category> categories = null;
    private List<Author> authors = null;
    private Publisher publisher;
    private int publishingYear;
    private String sysnopsis;
    private float price;
    private int quanlity;

    public Book(String ISBN, String tittle, List<Category> categories, List<Author> authors, Publisher publisher, int publishingYear, String sysnopsis, float price, int quanlity) {
        this.ISBN = ISBN;
        this.tittle = tittle;
        this.categories = categories;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.sysnopsis = sysnopsis;
        this.price = price;
        this.quanlity = quanlity;
    }   

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
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

    public String getSysnopsis() {
        return sysnopsis;
    }

    public void setSysnopsis(String sysnopsis) {
        this.sysnopsis = sysnopsis;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }
    
}
