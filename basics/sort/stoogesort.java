/*
 * Stooge Sort is a recursive sorting algorithm. It is defined as below:
 *  1. If the value at the start is greater than the value at the end, swap them.
 *  2. If there are 3 or more elements in the list, then:
 *      2.1. Stooge sort the initial 2/3 of the list
 *      2.2. Stooge sort the final 2/3 of the list
 *      2.3. Stooge sort the initial 2/3 of the list again
 *  3. Return the list
 * 
 * Time Complexity: O(n^(log 3 / log 1.5)) = O(n^2.7095)
 * Space Complexity: O(n)
 * 
 * Here, the time complexity is worse than Bubble Sort, but the space complexity is better.
 * 
 * Here's an example of stooge sort implementation in Java
 */

import java.util.Arrays;

public class stoogesort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 3, 1 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        stoogeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void stoogeSort(int[] arr, int start, int end) {
        if (arr[start] > arr[end]) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        if (end - start + 1 > 2) {
            int t = (end - start + 1) / 3;
            stoogeSort(arr, start, end - t);
            stoogeSort(arr, start + t, end);
            stoogeSort(arr, start, end - t);
        }
    }
}