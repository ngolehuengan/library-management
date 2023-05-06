package main.java.com.library.DTO;

/**
 *
 * @author ant1006
 */
public class Test {
    public static void main (String[] args) {
        Book e1 = new Book();
        Document e = (Document) e1;
        System.out.println(e.getClass().getSimpleName());
    }
}
