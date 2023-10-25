/**
 * This Mergesort class implements the mergesort algorithm to sort an array of
 * integers in ascending order.
 *
 * The main method generates a random array of integers, calls the mergesort
 * method to sort the array, and prints out the sorted array.
 *
 * The mergesort method starts the recursive sorting process by calling itself
 * with the full array bounds.
 *
 * The recursive mergesort method splits the array into halves until small
 * subarrays remain. It then calls merge to combine and sort the subarrays in
 * pairs until the full array is reassembled in sorted order.
 *
 * The merge method takes two sorted subarrays and combines them into a single
 * sorted array. It creates left and right temporary arrays from the subarrays,
 * compares elements from each, and merges them into the original input array.
 */

import java.util.Arrays;
import java.util.Random;

public class Mergesort {

    // Generates a random array to sort
        public static void main(String[] args) {

// Get random array size
        int randomNumber = new Random().nextInt(100);
            // Initialize random array
        int[] array = new int[randomNumber];

            // Populate array with random ints
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }

            // Call mergesort
        mergesort(array);
            // Print sorted array
        System.out.println("Sorted array:" + Arrays.toString(array));
    }

    // Starts the recursive mergesort
    private static void mergesort(int[] array) {
        mergesort(array, 0, array.length - 1);
    }

    // Recursively splits array and sorts subarrays
    private static void mergesort(int[] array, int i, int i1) {
        //Base case
        if (i < i1) {
            // Find midpoint
            int j = (i + i1) / 2;
            // Sort left half
            mergesort(array, i, j);
            // Sort right half
            mergesort(array, j + 1, i1);
            // Merge sorted halves
            merge(array, i, j, i1);
        }
    }

    private static void merge(int[] array, int i, int j, int i1) {

        // Merges two sorted subarrays into one sorted array
        int[] left = new int[j - i + 1];
        int[] right = new int[i1 - j];
        int k = 0;
        for (int l = i; l <= j; l++) {
            left[k] = array[l];
            k++;
        }
        k = 0;
        for (int l = j + 1; l <= i1; l++) {
            right[k] = array[l];
            k++;
        }
        k = i;
        int l = 0;
        int r = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                array[k] = left[l];
                l++;
            } else {
                array[k] = right[r];
                r++;
            }
            k++;
        }
        while (l < left.length) {
            array[k] = left[l];
            l++;
            k++;
        }
        while (r < right.length) {
            array[k] = right[r];
            r++;
            k++;
        }
    }
}
