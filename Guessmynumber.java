import java.util.Scanner;
import java.util.Random;

public class Guessmynumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int numberOfAttempts = 0;

        System.out.println("Welcome to Guess My Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;
            
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
    }
}
