/*
 * Jump Search is a searching algorithm for sorted arrays. The basic idea is to check fewer elements (than linear search) by jumping ahead by fixed steps or skipping some elements in place of searching all elements.
 * For example, suppose we have an array arr[] of size n and block (to be jumped) size m. Then we search at the indexes arr[0], arr[m], arr[2m]…..arr[km] and so on. Once we find the interval (arr[km] < x < arr[(k+1)m]), we perform a linear search operation from the index km to find the element x.
 * Here's the code for Jump Search in Java:
 */

import java.util.Scanner;

public class jump_search {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int x = scanner.nextInt();
        int index = jumpSearch(array, x);
        System.out.println("Number " + x + " is at index " + index);
        scanner.close();
    }

    private static int jumpSearch(int[] array, int x) {
        int n = array.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (array[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        while (array[prev] < x) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        if (array[prev] == x) {
            return prev;
        }

        return -1;
    }
}