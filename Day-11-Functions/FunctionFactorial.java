import java.util.*;

// Write a program to Write function to find factorial.

public class FunctionFactorial {

    public static long findFactorial( int number ) {

        long factorial = 1;

        for ( int i = 1; i <= number; i++ ) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long factorial = findFactorial(number);
            System.out.println("The factorial of the given number is : " + factorial);
        }

        sc.close();
    }
}