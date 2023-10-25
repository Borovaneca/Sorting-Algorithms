/**
 * This SelectionSort class implements the selection sort algorithm to
 * sort an array of integers in ascending order.
 *
 * The selection sort algorithm works by repeatedly finding the minimum
 * element in the unsorted portion of the array and moving it to the
 * sorted portion until the full array is sorted.
 */

import java.util.Arrays;

public class Selectionsort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 2, 4};

        // Call selection sort
        selectionSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Performs a selection sort on the given integer array.
     *
     * @param arr the array to be sorted
     */
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // Find index of minimum element in unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap found minimum with first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
