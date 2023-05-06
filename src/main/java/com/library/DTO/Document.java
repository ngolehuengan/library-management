package DTO;

/**
 * type = [Books;Copies;Serials;Theses;Others]
 *
 * @author ant1006
 */
public abstract class Document {

    protected int ID = 0;
    protected String code;
    protected String title;
    protected String description;
    protected String image;

    public Document() {
    }

    public Document(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public Document(int ID, String code, String title, String description, String image) {
        this.ID = ID;
        this.code = code;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public abstract String getCode();
}