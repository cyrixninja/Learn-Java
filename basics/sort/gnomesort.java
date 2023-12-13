/*
 * Gnome Sort is a sorting algorithm which is similar to Insertion Sort, except that moving an element to its proper place is accomplished by a series of swaps, as in Bubble Sort.
 * Here's example of gnome sort in Java.
 */

public class gnomesort {
    public void gnomeSort(int[] arr) {
        int n = arr.length;
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }



    public static void main(String[] args) {
        int[] arr = { 15, 14, 64, 2, 10, -9, 0, 1, 7, 8, 9, 3 };
        gnomesort sorter = new gnomesort();
        sorter.gnomeSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}