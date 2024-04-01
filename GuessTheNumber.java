import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = (int) (Math.random()*100)+1;
        
        // Initialize variables
        int attempts = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Guess the Number game!");
        
        // Main game loop
        while (true) {
            System.out.print("Guess the number (between 1 and 100): ");
            // Read the user's guess
            guess = scanner.nextInt();
            attempts++;
            
            // Check if the guess is correct
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly.");
                System.out.println("It took you " + attempts + " attempts to win the game.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
