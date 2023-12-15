/*
 * Shell sort is a generalized version of insertion sort. We can think of it as an insertion sort that works on a gap of the array.
 * The idea is to arrange the list of elements so that, starting anywhere, considering every hth element gives a sorted list.
 * Such a list is said to be h-sorted. Equivalently, it can be thought of as h interleaved lists, each individually sorted.
 * Beginning with large values of h allows elements to move long distances in the original list, reducing large amounts of disorder quickly,
 * and leaving less work for smaller h-sort steps to do. If the list is then k-sorted for some smaller integer k, then the list remains h-sorted.
 * Following this idea for a decreasing sequence of h values ending in 1 is guaranteed to leave a sorted list in the end.
 * The shellsort sorting algorithm is an in-place comparison sort. It can be seen as either a generalization of sorting by exchange (bubble sort)
 * or sorting by insertion (insertion sort). The method starts by sorting pairs of elements far apart from each other, then progressively reducing the gap between elements to be compared.
 * Starting with far apart elements, it can move some out-of-place elements into position faster than a simple nearest neighbor exchange.   
 * The running time of Shellsort is heavily dependent on the gap sequence it uses. For many practical variants, determining their time complexity remains an open problem.
 * Donald Shell published the first version of this sort in 1959. The running time of Shellsort is heavily dependent on the gap sequence it uses.
 * 
 * Here's an example of Shell sort in Java:
 */

public class shellsort {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        // Shell sort
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            // Insertion sort
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }

        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
