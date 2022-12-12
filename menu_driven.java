// Write a menu driven program to calculate the
// area and circumference of a circle.

import java.util.Scanner;

public class menu_driven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to calculate the area (1) or the circumference (2)? ");

        int choice = input.nextInt();
        double pi = 3.141;

        switch (choice) {
            case 1:
            System.out.println("Radius: ");
            int radius = input.nextInt();

            double area = pi * radius * radius;
            System.out.println("The area of the circle is " + area);
            break;

            case 2:
            System.out.println("Radius: ");
            int radius_c = input.nextInt();

            double circumference = 2 * pi * radius_c;
            System.out.println("The circumference is " + circumference);
            break;
        }
    }
}
