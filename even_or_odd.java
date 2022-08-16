// Write a Java program to accept three numbers and
// find the largest among them using an if statement.

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number. ");
        }
        else {
            System.out.println(number + " is an odd number. ");
        }
    }
}
