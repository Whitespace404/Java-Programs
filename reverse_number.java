/* Write a program that accepts a number and reverses
it. */

import java.util.*;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to be reversed ");
        int number = sc.nextInt();
        int reversed_number = 0;
        
        while (number != 0) {
            int remainder = number % 10; /* to get the last digit */
            reversed_number = (reversed_number * 10) + remainder; /* to add the last digit into the "reversed" number */
            number /= 10; /* numbers after the decimal place get truncated, integer datatype */
        }
        System.out.println(reversed_number);
   }
}
