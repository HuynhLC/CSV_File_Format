package Repository;

import DataAccess.CSV_DAO;
import java.util.ArrayList;
import model.CSV;

public class CSV_Repository implements ICSV_Repository {
    
    @Override
    public void formatName(ArrayList<CSV> ls) {
        CSV_DAO.Instance().formatName(ls);
    }

    @Override
    public void formatAddress(ArrayList<CSV> ls) {
        CSV_DAO.Instance().formatAddress(ls);
    }

    @Override
    public void importFile(ArrayList<CSV> ls) {
        CSV_DAO.Instance().importFile(ls);
    }

    @Override
    public void exportFile(ArrayList<CSV> ls) {
        CSV_DAO.Instance().exportFile(ls);
    }

    @Override
    public void print(ArrayList<CSV> ls) {
        CSV_DAO.Instance().print(ls);
    }
}
