/*
 * Bogosort is a sorting algorithm that shuffles the array until it is sorted.
 *  Worst case: O(∞)    
 *  Average case: O(n*n!)
 *  Best case: O(n)
 *  Space: O(1)
 * Here, we have implemented bogosort using Java.
 */

import java.util.Arrays;

public class bogosort {
    public static void main(String[] args) {
        int[] arr = { 6, 10, -21, -2, 2, 1, 3, 4 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        bogosort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bogosort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int randomIndex = (int) (Math.random() * arr.length);
            swap(arr, i, randomIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}