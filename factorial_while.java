/*
 Write a program that finds the factorial
 of a given number using a while loop
*/

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int result = 1;
        
        while (number > 0) {
            result = result * number;
            number--;
        }
        System.out.println(result);
    }
}
