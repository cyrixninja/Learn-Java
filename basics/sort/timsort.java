/*
 * TimSort is a sorting algorithm based on Insertion Sort and Merge Sort.
 * Here is the link for more information: https://en.wikipedia.org/wiki/Timsort
 * Here's an Example of TimSort in Java:
 */

import java.util.Arrays;
import java.util.Collections;

public class timsort {
    public static void main(String[] args) {
        Integer[] arr = { 2, 5, 3, 7, 1, 9, 4, 6, 8 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}

// Output: [9, 8, 7, 6, 5, 4, 3, 2, 1]