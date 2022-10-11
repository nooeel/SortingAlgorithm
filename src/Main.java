import generator.Generator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int anzahlInts = 100;

        Generator generator = new Generator(anzahlInts);

        int verfahren = getVerfahren();


    }

    public static int getVerfahren() {  // Verfahrensabfrage
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welches Verfahren willst du verwenden?");
        System.out.println("1. Selection Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Bubble Sort");
        System.out.print("\n");

        return scanner.nextInt();
    }

    public ArrayList<Integer> zuSortieren(ArrayList<Integer> sortingList, int verfahren) {
        if (verfahren == 0) {
            System.out.println("Du hast keine gültige Zahl ausgewählt");

        } else if (verfahren == 1) {        //Selection Sort
            int tmp;

            for (int i = 0; i < sortingList.size(); i++) {

                for (int j = 0; (j < sortingList.size()-1); j++) {

                    if (sortingList.get(j) > sortingList.get(j+1)) {
                        tmp = sortingList.get(j);
                        sortingList.set(j, sortingList.get(j+1));
                        sortingList.set(j+1, tmp);
                    }

                }
            }
        } else if (verfahren == 2) {        // Insertion Sort


        }

        return sortingList;
    }

}