package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class Other extends Document {
    @Override
    public String getCode() {
        return "OT_" + this.getID();
    }
}
