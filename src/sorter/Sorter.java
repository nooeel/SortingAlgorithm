package sorter;

import java.util.ArrayList;


public class Sorter {

    ArrayList<Integer> sortedList;

    boolean sortiert = false;
    int methode = 0;


    public Sorter(int methode) {
        if (methode == 1 || methode == 2 || methode == 3) {
            System.out.println("methode " + methode + "ausgewählt\n");
            this.methode = methode;

        } else {
            System.out.println("Ungültige Zahl. \n");
            sortiert = false;
        }
    }

    public ArrayList<Integer> sorted(ArrayList<Integer> unsortedList) {

        if (methode == 1) {     // Bubble Sort

            //---------- BUBBLE SORT ----------//
            sortiert = false;
            int smaller;
            int bigger;

            for (int i = 0; i < unsortedList.toArray().length && sortiert == false; i++) {
                sortiert = true;

                for (int y = 0; y < unsortedList.toArray().length; y++) {
                    if (unsortedList.get(y) > unsortedList.get(y + 1)) {
                        bigger = unsortedList.get(y);
                        smaller = unsortedList.get(y + 1);
                        unsortedList.add(y, smaller);
                        unsortedList.add(y + 1, bigger);
                        sortiert = false;
                    }
                }

            }


            //---------------------------------//

            return sortedList;

        } else if (methode == 2) {      // Insertion Sort

            //-------- INSERTION SORT ----------//

            //----------------------------------//

            return sortedList;

        } else if (methode == 3) {      // Selection Sort

            //------- SELECTION SORT ----------//

            //---------------------------------//

            return sortedList;

        } else {
            System.out.println("\n\n--Error: Sorting Zuweisung--\n\n");
            return null;
        }
    }


}
