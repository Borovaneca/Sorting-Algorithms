/**
 * This Bubblesort class implements the bubble sort algorithm to sort an array of
 * integers in ascending order.
 *
 * The bubble sort algorithm works by repeatedly comparing adjacent elements
 * and swapping them if they are out of order. This continues until the array
 * is fully sorted.
 */

import java.util.Arrays;

public class Bubblesort {

    // Generates random integer array
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5};

        // Calls bubble sort method
        bubbleSort(arr);

        // Prints sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Bubble sort method that sorts the given integer array in ascending order.
     *
     * @param arr the integer array to be sorted
     */
    public static void bubbleSort(int[] arr) {

        // Outer loop for passes
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop for comparisons between adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Swap elements if out of order
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
