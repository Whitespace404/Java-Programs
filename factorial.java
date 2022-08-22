/*
 Write a program that finds the factorial
 of a given number.
 
 HINT: Factorial of a number is the product of the number
 and all whole numbers before it.
 
 Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120
 */

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int result = 1;
        for (int i = number; i>0; i--) {
          result = result * i;
        }
        System.out.println(result);
    }
}
