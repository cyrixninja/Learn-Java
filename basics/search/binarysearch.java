/*
  Binary Search is a searching algorithm for finding an element's position in a sorted array.
  Here's example of binary search in Java.
 */
package basics.search;

public class binarysearch {
    // Function to perform binary search
    static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore the left half
            if (arr[mid] < target)
                left = mid + 1;

            // If target is smaller, ignore the right half
            else
                right = mid - 1;
        }

        // If target is not present in the array
        return -1;
    }


    public static void main(String args[]) {
        int arr[] = { 2, 3, 15, 4, 10, 40 };
        int target = 15;

        int result = binarySearch(arr, target);

        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);
    }
}
