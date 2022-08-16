// Write a program to accept a month and display 
// the corresponding season

// 1-2  | Spring
// 3-5  | Summer
// 6-8  | Monsoon
// 9-12 | Winter

import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        switch (month) {
            case 1:
            case 2:
            System.out.println("Monsoon");
            break;

            case 3:
            case 4:
            System.out.println("Summer");
            break;

            case 6:
            case 7:
            case 8:
            System.out.println("Monsoon");
            break;

            case 9:
            case 10:
            case 11:
            case 12:
            System.out.println("Winter");
            break;
        }
    }
}
