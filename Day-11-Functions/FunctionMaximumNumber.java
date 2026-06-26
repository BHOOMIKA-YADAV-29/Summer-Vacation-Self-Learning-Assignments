import java.util.*;

// Write a program to Write function to find maximum.

public class FunctionMaximumNumber {

    public static int findMaximum( int firstNumber, int secondNumber ) {

        if ( firstNumber > secondNumber ) {
            return firstNumber;
        } 
        else {
            return secondNumber;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number :");
        int secondNumber = sc.nextInt();

        int maximum = findMaximum( firstNumber, secondNumber );

        System.out.println("The maximum number is : " + maximum);

        sc.close();
    }
}
