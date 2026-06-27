import java.util.*;

// Write a program to Write function for perfect number.

public class FunctionPerfectNumber {

    public static void checkPerfectNumber(int number) {

        if ( number <= 1 ) {
            System.out.println("The given number is not a Perfect Number");
            return;
        }

        int sum = 1;

        for ( int i = 2; i < number; i++ ) {
            if ( number % i == 0 ) {
                sum += i;
            }
        }

        if ( sum == number ) {
            System.out.println("The given number is a Perfect Number");
        } 
        else {
            System.out.println("The given number is not a Perfect Number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        checkPerfectNumber(number);

        sc.close();
    }
}
