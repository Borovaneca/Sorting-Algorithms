/**
 * This Quicksort class implements the quicksort algorithm to sort an array of
 * integers.
 *
 * The main method generates a random array of integers, calls the quicksort
 * method to sort them, and prints out the sorted array.
 *
 * The quicksort method recursively sorts the array using the quicksort algorithm.
 * It selects a pivot element, partitions the array into two subarrays of elements
 * less than and greater than the pivot, and then recursively sorts the subarrays.
 *
 * The partition method is used to partition the array around the pivot. It moves
 * elements less than the pivot to the left side and returns the index of the pivot.
 *
 * The swap method swaps two elements in the array. This is used by the partition
 * method during the partitioning process.
 */
import java.util.Arrays;
import java.util.Random;

public class Quicksort {

    // Generates a random array of integers to sort
    public static void main(String[] args) {

        int rand = new Random().nextInt(10);
        int[] arr = new int[rand];
        for (int i = 0; i < rand; i++) {
            arr[i] = new Random().nextInt(10);
        }

        // Calls the quicksort method to sort the array
        quicksort(arr, 0, arr.length - 1);

        // Prints out the sorted array
        System.out.println(Arrays.toString(arr));
    }


    // Recursively sorts the array using quicksort
    private static void quicksort(int[] arr, int left, int right) {

        if (left < right) {

            // Gets the pivot point
            int pivot = partition(arr, left, right);

            // Recursively sort left and right subarrays
            quicksort(arr, left, pivot - 1);
            quicksort(arr, pivot + 1, right);
        }
    }

    // Partitions array around a pivot point
    private static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];
        int i = left - 1;

        // Moves elements <= pivot to the left
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Puts pivot in place
        swap(arr, i + 1, right);
        return i + 1;
    }

    // Swaps two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
