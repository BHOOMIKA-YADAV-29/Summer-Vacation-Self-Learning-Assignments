import java.util.*;

/* Write a program to Write function to find sum of two numbers. */

public class FunctionSum {

    public static int findSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number :");
        int secondNumber = sc.nextInt();

        int sum = findSum( firstNumber, secondNumber );

        System.out.println("The sum of the two numbers is : " + sum);

        sc.close();
    }
}
