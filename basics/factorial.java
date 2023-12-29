/*
 * Factorial of a number is the product of all the integers from 1 to that number.
 * For example, the factorial of 6 is 1*2*3*4*5*6 = 720.
 * Here's the code for Factorial in Java:
 */

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int factorial = factorial(n);
        System.out.println("Factorial of " + n + " is " + factorial);
        scanner.close();
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}