import generator.Generator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Wie viele Ints soll die Liste haben?");
        int anzahlInts = scanner.nextInt();


        Generator generator = new Generator(anzahlInts);

        int verfahren = getVerfahren(scanner);



        generateOutput(generator, verfahren);

    }

    public static int getVerfahren(Scanner scanner) {  // Verfahrensabfrage


        System.out.println("Welches Verfahren willst du verwenden?");
        System.out.println("1. Selection Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Bubble Sort");
        System.out.print("\n");

        return scanner.nextInt();
    }

    public static ArrayList<Integer> sortierterOutput(ArrayList<Integer> sortingList, int verfahren) {

        if (verfahren == 0) {
            System.out.println("Du hast keine gültige Zahl ausgewählt");

        } else if (verfahren == 1) {        //Selection Sort
            int tmp;

            for (int i = 0; i < sortingList.size(); i++) {              // Durchgehen bis jedes am richtigen Platz

                for (int j = 0; (j < sortingList.size()-1); j++) {      // Für einen Durchlauf suchen nach:

                    if (sortingList.get(j) > sortingList.get(j+1)) {    // ist j kleiner als j+1
                        tmp = sortingList.get(j);
                        sortingList.set(j, sortingList.get(j+1));       // wenn ja Tausche die Beiden
                        sortingList.set(j+1, tmp);
                    }

                }
            }



        } else if (verfahren == 2) {        // Insertion Sort

            int tmp;
            int i;
            int j;

            for (i = 0; i < sortingList.size(); i++) {
                tmp = sortingList.get(i);
                j = i;

                while ((j > 0) && (sortingList.get(j - 1) > tmp)) {
                    sortingList.set(j, sortingList.get(j-1));
                    j = j-1;
                }

                sortingList.set(j, tmp);
            }

        }

        return sortingList;         // Gebe sortierte Liste zurück
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


        for (int i = 0; i < sortierterOutput(generator.getUnsortedList(), verfahren).size(); i++) {

            System.out.print(generator.getUnsortedList().get(i));

            if (i != sortierterOutput(generator.getUnsortedList(), verfahren).size() - 1)  {    // wenn nicht das letzte
                System.out.print(", ");
            }

            if (i%20 == 19) {
                System.out.println();
            }
        }

        double timeEnded = System.nanoTime();

        System.out.println();
        System.out.print("Das Sortieren hat ");
        System.out.print((timeEnded - timeBegin) / 1_000_000_000);
        System.out.print(" Sekunden gedauert.");

        System.out.println();
    }

}