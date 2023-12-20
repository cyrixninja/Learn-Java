/*
 * Linear Search in Java
 * Here's Implementation of Linear Search in Java
 */
package basics.search;

public class linearsearch {
    // Function to perform linear search
    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found in the array
    }

    // Driver method to test the above
    public static void main(String args[]) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 42 };
        int target = 16;

        int result = linearSearch(arr, target);

        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);
    }
}
