/* Write a program to input a number and check whether
it is a negative number or a positive number. */

import java.util.Scanner;

public class plusoRRminus {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    
    if (number > 0) {
      System.out.println(number + " is positive.")
    }
    else if (number < 0) {
      System.out.println(number + " is negative.");
    }
    else {
      System.out.println(number + " is zero.")
    }
  }
}
