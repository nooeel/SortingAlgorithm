import generator.Generator;
import sorter.Sorter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int anzahlInts = 100;

        boolean sortiert = false;
        Generator generator = new Generator(anzahlInts);

        int verfahren = getVerfahren();
        Sorter sorter = new Sorter(verfahren);

        while (sortiert == false) {          // endstatement
            sorter.sorted(generator.getUnsortedList());
            sortiert = sorter.isSortiert();
        }

        printResult(sorter, anzahlInts);
    }

    public static int getVerfahren() {  // Verfahrensabfrage
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welches Verfahren willst du verwenden?");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Selection Sort");
        System.out.print("\n");

        return scanner.nextInt();
    }

    public static void printResult(Sorter sorter, int anzahlInts) {

        System.out.println("test");

        ArrayList<Integer> sortedInts = sorter.getSortedList();

        for (int i = 0; i < anzahlInts; i++) {
            System.out.print(sortedInts.get(i));
        }
    }
}