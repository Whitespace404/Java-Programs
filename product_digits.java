/* Write a program to find the product of digits 
of an entered number. */

import java.util.*;

public class product_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 1;
        
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        System.out.println(product);
    }
}
