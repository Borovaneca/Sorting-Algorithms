/**
 * This Insertionsort class implements the insertion sort algorithm to
 * sort an array of integers in ascending order.
 *
 * The insertion sort algorithm works by iterating through the array, taking
 * each element and inserting it into the sorted portion of the array in the
 * correct position.
 */

import java.util.Arrays;

public class Insertionsort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5};

        // Call insertion sort
        insertionSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Performs an insertion sort on the given integer array.
     *
     * @param arr the array to be sorted
     */
    public static void insertionSort(int[] arr) {

        // Start at 1 since first element is sorted
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i - 1;

            // Shift elements right until correct position found
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert element in correct position
            arr[j + 1] = temp;
        }
    }
}
