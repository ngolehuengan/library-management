package main.java.com.library.DAL;

import java.util.Vector;
import main.java.com.library.DTO.Document;

/**
 *
 * @author ant1006
 */
public class DocumentDAO extends ConnectDB {
    
    public Document getByCode(String code) {
        if (code.contains("BK"))
            return new BookDAO().getByCode(code);
        if (code.contains("CP"))
            return new CopyDAO().getByCode(code);
        if (code.contains("TH"))
            return new ThesesDAO().getByCode(code);
        return new OtherDAO().getByCode(code);
    }
    
    public Vector<Document> getByCode(Vector<String> vt) {
        Vector<Document> rs = new Vector<>();
        for (int i = 0; i < vt.size(); i++) {
            rs.add(getByCode(vt.get(i)));
        }
        return rs;
    }
    
}
