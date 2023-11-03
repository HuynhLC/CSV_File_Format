
import controller.CSV_File_Program;

public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Import CSV","Format Address","Format Name","Export CSV"};
        CSV_File_Program c = new CSV_File_Program("======= Format CSV Program =======", mChon, "Exit");
        c.run();
    }
}
