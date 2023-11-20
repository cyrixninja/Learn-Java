package basics;
/*
 * Calculator in Java using Switch Case
 */

import java.util.Scanner;

public class calculator_switch_case {
    public static void main(String[] args) {
    Scanner val = new Scanner(System.in);
    Scanner op = new Scanner(System.in); 

        
    System.out.println("Enter Value of X : ");
    int x = val.nextInt();
    System.out.println("Enter Value of Y : ");
    int y = val.nextInt();

    System.out.println("Enter a Operator :  * + / - ");
    char operator = op.next().charAt(0);

    switch (operator) {
        case '+':
        System.out.println("The Answer is : "+(x+y));
            break;  
        case '*':
        System.out.println("The Answer is : "+(x*y));
            break;  
        case '/':
        System.out.println("The Answer is : "+(x/y));
            break;  
        case '-':
        System.out.println("The Answer is : "+(x-y));
            break;  
        default:
        System.out.println("Invalid Values !");
            break;
    }
    val.close();
    op.close();
    }
        
    }
    

