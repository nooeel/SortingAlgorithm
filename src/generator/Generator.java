package generator;

import java.util.ArrayList;
import java.util.Collections;

public class Generator {

    int anzahlInts = 100;

    ArrayList<Integer> unsortedList = new ArrayList<Integer>();

    public Generator(int anzahlInts) {
        for (int a = 0; a < anzahlInts; a++) {
            unsortedList.add(a);
        }


        Collections.shuffle(unsortedList);

        System.out.println("Die unsortierten Zahlen sind:");
        for (int a = 0; a < anzahlInts; a++) {
            System.out.print(unsortedList.get(a) + ", ");

            if (a%10 == 9) {
                System.out.println();
            }
        }
        System.out.println("\n_____________________________________________\n");
    }

    public ArrayList<Integer> getUnsortedList() {
        return unsortedList;
    }
}
