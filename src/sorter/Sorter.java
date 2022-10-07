package sorter;

import java.sql.Array;
import java.util.ArrayList;


public class Sorter {

    boolean sortiert = false;
    int methode = 0;


    public Sorter(int methode) {
        if (methode == 1 || methode == 2 || methode == 3) {
            System.out.println("methode " + methode + "ausgewählt");
            this.methode = methode;

        } else {
            System.out.println("Ungültige Zahl. \n");
            sortiert = false;
        }
    }

    public void sort(ArrayList<Integer> unsortedList) {

    }

}
