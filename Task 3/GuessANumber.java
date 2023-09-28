import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
         Scanner sc = new Scanner(System.in); // Create a Scanner object   

         int attempts = 1;
         int guess = -1;

         System.out.println("Enter your guess:");

         if (sc.hasNextInt()) {
            while(guess != rnd_number) {
                guess = sc.nextInt(); // Read user input

                if (guess < rnd_number) {
                    System.out.println("Your guess is too low, try again.");
                    attempts++;

                } else if (guess > rnd_number) {
                    System.out.println("Your guess is too high, try again.");
                    attempts++;
                } else {
                    System.out.println("Congratulations! You guessed correctly in " + attempts + " attempts.");

                }

            }
        } else {
            System.out.println("Please input a valid number between 1 and 100.");
        }

    }
}
