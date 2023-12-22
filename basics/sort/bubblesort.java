/*
  Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
  Here's example of bubble sort in Java.
 */
package basics.sort;

public class bubblesort {
    // Function to perform Bubble Sort
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, the array is already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
