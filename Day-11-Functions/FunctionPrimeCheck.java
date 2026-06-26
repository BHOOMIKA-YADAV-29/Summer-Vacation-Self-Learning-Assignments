import java.util.*;

// Write a program to Write function to check prime.


public class FunctionPrimeCheck {

    // This function checks whether a number is prime.
    public static void checkPrime(int number) {

        if (number <= 1) {
            System.out.println("The given number is not a Prime Number");
            return;
        }

        for ( int i = 2; i * i <= number; i++ ) {
            if (number % i == 0) {
                System.out.println("The given number is not a Prime Number");
                return;
            }
        }

        System.out.println("The given number is a Prime Number");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = sc.nextInt();

        checkPrime(number);

        sc.close();
    }
}