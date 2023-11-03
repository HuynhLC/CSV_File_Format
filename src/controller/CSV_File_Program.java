package controller;

import Repository.CSV_Repository;
import java.util.ArrayList;
import model.CSV;
import view.Menu;

public class CSV_File_Program extends Menu{
    private ArrayList<CSV> ls;
    private final CSV_Repository csv;
    
    public CSV_File_Program(String td, String[] mc, String exit) {
        super(td, mc, exit);
        ls = new ArrayList<CSV>();
        csv = new CSV_Repository();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                csv.importFile(ls);
                csv.print(ls);
                break;
            case 2:
                csv.formatAddress(ls);
                csv.print(ls);
                break;
            case 3:
                csv.formatName(ls);
                csv.print(ls);
                break;
            case 4:
                csv.exportFile(ls);
                break;
            case 5:
                System.exit(0);
        }
    }
}
