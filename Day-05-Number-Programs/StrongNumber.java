import java.util.*;

// Write a program to Check strong number.
public class StrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        while ( number > 0 ) {

            int digit = number % 10;
            int factorial = 1;

            for ( int i = 1; i <= digit; i++ ) {
                factorial *= i;
            }

            sum += factorial;
            number /= 10;
        }

        if ( sum == originalNumber ) {
            System.out.println("It is a Strong Number");
        } 
        else {
            System.out.println("It is not a Strong Number");
        }

        sc.close();
    }
}
