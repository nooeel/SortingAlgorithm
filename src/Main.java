import generator.Generator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int anzahlInts = 100;


        Generator generator = new Generator(anzahlInts);

        int verfahren = getVerfahren();



        generateOutput(generator, verfahren);

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

    public static ArrayList<Integer> sortierenOutput(ArrayList<Integer> sortingList, int verfahren) {

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

    public static void generateOutput(Generator generator, int verfahren) {

        System.out.print("Starte sortieren...   Verwendetes Verfahren ist: ");

        if (verfahren == 1) {
            System.out.print("Selection Sort.");
        } else if (verfahren == 2) {
            System.out.print("Insertion Sort.");
        } else if (verfahren == 3) {
            System.out.print("Bubble Sort.");
        }

        System.out.println("\n Der Timer wird jetzt gestartet...");

        double timeBegin = System.nanoTime();

        System.out.println("\n\nSortierte Liste:");
        System.out.println("_______________________________________\n");


        for (int i = 0; i < sortierenOutput(generator.getUnsortedList(), verfahren).size(); i++) {
            System.out.print(generator.getUnsortedList().get(i) + ", ");
            if (i%10 == 9) {
                System.out.println();
            }
        }

        double timeEnded = System.nanoTime();

        System.out.println();
        System.out.print("Das Sortieren hat ");
        System.out.print(timeEnded - timeBegin);
        System.out.print(" Sekunden gedauert.");
    }

}