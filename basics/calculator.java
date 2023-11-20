/*
Calculator using If Else in Java
 */

package basics;
import java.util.Scanner;


public class calculator {
    public static void main(String[] args) {
        
    
    Scanner val = new Scanner(System.in);
    Scanner op = new Scanner(System.in);


    System.out.println("Enter Value of X : ");
    int x = val.nextInt();
    System.out.println("Enter Value of Y : ");
    int y = val.nextInt();

    System.out.println("Enter a Operator :  * + / - ");
    char operator = op.next().charAt(0);


    if(operator=='+'){
    System.out.println("The Answer is : "+(x+y));
    }
    else if(operator=='-'){
    System.out.println("The Answer is :"+(x-y));
    }
    else if(operator=='*'){
    System.out.println("The Answer is :"+(x*y));
    }
    else if(operator=='/'){
    System.out.println("The Answer is :"+(x/y));
    }

    val.close();
    op.close();
}
}
