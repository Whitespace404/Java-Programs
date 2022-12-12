/* Write a Java program to accept a number and print
that many numbers of the Fibonacci series */

import java.util.*;

public class fibbonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of values required: ");
        int values = sc.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        int iterations = 0;
  
        while (iterations < values) {
            System.out.println(n1);
            int sum = n1 + n2;

            n1 = n2;
            n2 = sum;
            iterations++;
        }
    }
}
