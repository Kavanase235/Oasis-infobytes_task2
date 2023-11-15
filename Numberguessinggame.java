import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                score += (maxAttempts - attempts + 1) * 10; // Score based on attempts
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Try again. The number is higher.");
            } else {
                System.out.println("Try again. The number is lower.");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
            }
        }

        System.out.println("Your score: " + score);
        scanner.close();
    }
}
