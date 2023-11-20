package basics;

import java.util.Scanner;

public class calculator_methods {

// Methods
static void add(int x, int y) {
    System.out.println(x+y);
  }
static void substract(int x, int y) {
    System.out.println(x-y);
  }
static void divide(int x, int y) {
    System.out.println(x/y);
  }
static void multiply(int x, int y) {
    System.out.println(x*y);
  }

  // Main

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
    add(x, y);;
    }
    else if(operator=='-'){
    substract(x, y);;
    }
    else if(operator=='*'){
    multiply(x, y);;
    }
    else if(operator=='/'){
    divide(x, y);;
    }

    val.close();
    op.close();
}
}
