package algorithms.sorts.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp = j + 1;
                if (array[j] > array[temp]) {
                    array[j + 1] = array[j];
                    array[j] = array[temp];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};

        bubbleSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */
    }
}
