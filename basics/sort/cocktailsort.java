/*
 * Cocktail sort, also known as bidirectional bubble sort, cocktail shaker sort is a variation of bubble sort that is both a stable sorting algorithm and a comparison sort.
 * Here's an example of Cocktail Sort in Java
 */
public class cocktailsort {
    void cocktailSort(int a[]) {
        boolean swapped = true;
        int start = 0;
        int end = a.length;

        while (swapped == true) {
            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;

            swapped = false;
            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
    }

    public static void main(String[] args) {
        cocktailsort cs = new cocktailsort();
        int[] array = {5, 1, 4, 2, 8, 0, 2};
        int[] sortedArray = {0, 1, 2, 2, 4, 5, 8};
        cs.cocktailSort(array);

        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Test the sorted array
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("\nArray is sorted correctly.");
        } else {
            System.out.println("\nArray is not sorted correctly.");
        }
    }

}