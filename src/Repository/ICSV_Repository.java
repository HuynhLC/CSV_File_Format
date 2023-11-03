package Repository;

import java.util.ArrayList;
import model.CSV;

public interface ICSV_Repository {
    
    void formatName(ArrayList<CSV> ls);
    
    void formatAddress(ArrayList<CSV> ls);
    
    void importFile(ArrayList<CSV> ls);
    
    void exportFile(ArrayList<CSV> ls);
    
    void print(ArrayList<CSV> ls);
}
