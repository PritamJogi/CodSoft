
//NUMBER GAME
import java.util.Scanner;

public class NumGame {
    public static void main(String[] args) {

        // Generate a random number between 1 and 100
        int randomNum = (int) (Math.random() * 100) + 1;

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Start the game loop
        boolean guessedCorrectly = false;
        int numberOfAttempts = 0;
        System.out.println("Guess the number I'm thinking of between 1 and 100 "
                + "\nSystem Generated Number is " + randomNum);

        while (!guessedCorrectly && numberOfAttempts < 5) {

            // Get the user's guess
            int userGuess = sc.nextInt();

            // Check if the user guessed correctly
            if (userGuess == randomNum) {
                guessedCorrectly = true;
            } else {
                numberOfAttempts++;
                if (userGuess > randomNum) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
                System.out.println();
                System.out.println("Play again");
            }
        }

        // Close the Scanner object
        sc.close();

        // If the user guessed correctly, congratulate them. Otherwise, tell them the
        // correct answer.
        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed correctly! The number was " + randomNum);
        } else {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNum);
        }
    }

}