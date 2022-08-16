// Write a program to input a number between 1 and 7 and print
// the corresponding weekday

import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch (number) {
            case 1:
            System.out.println("Monday");
            case 2:
            System.out.println("Tuesday");
            case 3:
            System.out.println("Wednesday");
            case 4:
            System.out.println("Thursday");
            case 5:
            System.out.println("Friday");
            case 6:
            System.out.println("Saturday");
            case 7:
            System.out.println("Sunday");
            default:
            System.out.println("Not a weekday");
        }
    }
}
