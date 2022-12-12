/* Write a program to accept a number and find 
its digital root */

import java.util.*;

public class digital_root {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
 
        if (sum / 10 == 0) {
            System.out.println(sum);
        }
        else {
            int digital_root = 0;
            while (sum > 0) {
                digital_root += sum % 10;
                sum /= 10;
            }
            System.out.println(digital_root);
        }
    }
}
