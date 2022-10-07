import generator.Generator;
import sorter.Sorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean sortiert = false;
        Generator generator = new Generator(100);

        while (sortiert == false) {          // endstatement

            int verfahren = getVerfahren();
            Sorter sorter = new Sorter(verfahren);

            sorter.sorted(generator.getUnsortedList());

        }



    }

    public static int getVerfahren() {  // Verfahrensabfrage
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welches Verfahren willst du verwenden?");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Selection Sort");

        return scanner.nextInt();
    }

}