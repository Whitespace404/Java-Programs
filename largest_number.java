// Write a Java program to accept three numbers and
// find the largest among them using an if statement.

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Enter a number");
        n1 = input.nextInt();
        System.out.println("Enter another number");
        n2 = input.nextInt();
        System.out.println("Enter another number");
        n3 = input.nextInt();
        
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the greatest number.");
        }
        else if (n2 > n3 && n2 > n1) {
            System.out.println(n2 + " is the greatest number.");
        }
        else {
            System.out.println(n3 + " is the greatest number.");
        }
    }
}
