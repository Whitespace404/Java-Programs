// Write a program to accept a month
// and print the number of days

import java.util.Scanner;

public class number_of_days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.nextLine();

        switch (month) {
            case "January":
            case "May":
            case "March":
            case "August":
            case "October":
            case "December":
            System.out.println("31 days");
            break;

            case "February":
            System.out.println("28 days");
            break;

            case "April":
            case "June":
            case "September":
            case "November":
            System.out.println("30 days");
            break;
        }
    }
}
