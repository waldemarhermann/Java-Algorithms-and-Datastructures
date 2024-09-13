package algorithms.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1, int[] array2) {
        int[] sortedArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int current = 0;
        while(array1.length > i && array2.length > j) {
            if (array1[i] < array2[j]) {
                sortedArray[current] = array1[i];
                i++;
                current++;
            } else {
                sortedArray[current] = array2[j];
                j++;
                current++;
            }
        }
        while (array1.length > i) {
            sortedArray[current] = array1[i];
            i++;
            current++;
        }
        while (array2.length > j) {
            sortedArray[current] = array2[j];
            j++;
            current++;
        }
        return sortedArray;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] originalArray = {3,1,4,2};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "Original Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]

            Sorted Array: [1, 2, 3, 4]

         */
    }

}
