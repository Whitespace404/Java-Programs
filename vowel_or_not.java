// Write a program to accept a character and check 
// if it is a vowel or not.

import java.util.Scanner;

public class vowel_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char letter = input.next().charAt(0);

        if (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' || 
        letter == 'I' || letter == 'i' || letter == 'O' || letter == 'o' ||letter == 'U' || letter == 'u') {
            System.out.println(letter + " is a vowel. ");
        }
        else {
            System.out.println(letter + " is a consonant.");
        }
    }
}
