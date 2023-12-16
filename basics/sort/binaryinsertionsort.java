/*
 * Binary Insertion Sort is a variant of Insertion sorting algorithm.
 * Here's Binary Insertion Sort algorithm implementation in Java.
 */

import java.util.Arrays;

public class binaryinsertionsort {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 42, 6, 1, 3, 2 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        binaryInsertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void binaryInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            // Find location to insert using binary search
            int j = Math.abs(Arrays.binarySearch(arr, 0, i, x) + 1);
            // Shifting array to one location right
            System.arraycopy(arr, j, arr, j + 1, i - j);
            // Placing element at its correct location
            arr[j] = x;
        }
    }
}