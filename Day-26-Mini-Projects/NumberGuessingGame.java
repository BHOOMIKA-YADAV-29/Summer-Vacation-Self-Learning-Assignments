import java.util.*;

// Write a program to Create number guessing game.

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        do {

            System.out.print("Enter your guess : ");
            guess = sc.nextInt();
            attempts++;

            if ( guess > secretNumber ) {
                System.out.println("Too high! Try again");
            } 
            else if ( guess < secretNumber ) {
                System.out.println("Too low! Try again");
            } 
            else {
                System.out.println("Congratulations! You guessed the correct number");
                System.out.println("Number of attempts : " + attempts);
            }

        } 
        while ( guess != secretNumber );

        sc.close();
    }
}