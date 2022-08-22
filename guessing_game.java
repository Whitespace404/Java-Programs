/*
Write a program that picks a random two digit number and 
asks the user to guess it. It should give a clue about 
whether the number guessed is greater or lesser than the 
answer after every guess. The program should count
the number of guesses and print it after the user guesses 
it. The program should keep asking for a guess until the user
guesses the number.
*/

import java.util.Scanner;

public class guessing_game {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double random = Math.random() * 100; // Math.random() returns a random double
        // between 0 and 1 (ex: 0.5926535897), this is multiplied by 100 to get
        // a random two digit floating point number with trailing decimal.

        int correct_answer = (int) random; // Implicit type casting is used to
        // remove the trailing decimal.

        int attempts = 0;

        for (int i=0; i==0;) { // the termination expression will always evaluate
          // to True since we aren't incrementing the loop variable, and 0==0 = True.
          // We will manually set i equal to something that's not 0 when the user
          // has guessed the correct number so the termination expression evaluates
          // to False and the loop stops.
          System.out.println("Guess a number");
          int guess = input.nextInt();

          if (guess > correct_answer) {
            System.out.println("The answer is lesser than the number you guessed");
            attempts++;
          }
          else if (guess < correct_answer) {
            System.out.println("The answer is greater than the number you guessed");
            attempts++;
          }
          else {
            System.out.println("You got it! Your guess is the answer");
            attempts++;
            System.out.println("You got it in " + attempts + " tries. ");
            i = 1; // now the termination expression will evaluate to False and
            // end the loop
          }
        }
    }
}
