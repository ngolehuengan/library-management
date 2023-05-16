package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class Other extends Document {

    public Other() {
    }

    public Other(String title, String description, String image) {
        super(title, description, image);
    }

    public Other(int ID, String code, String title, String description, String image) {
        super(ID, code, title, description, image);
    }

}
