import java.util.*;

// Write a program to Write function for Armstrong.

public class FunctionArmstrong {

    public static void checkArmstrong(int number) {

        int originalNumber = number;
        int numberOfDigits = 0;
        int sum = 0;

        while ( number > 0 ) {
            numberOfDigits++;
            number /= 10;
        }

        number = originalNumber;

        while ( number > 0 ) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        if ( sum == originalNumber ) {
            System.out.println("The given number is an Armstrong Number");
        } 
        else {
            System.out.println("The given number is not an Armstrong Number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = sc.nextInt();

        checkArmstrong(number);

        sc.close();
    }
}
