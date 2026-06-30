import java.util.*;

// Write a program to find the sum of digits using recursion.

public class RecursiveSumOfDigits {

    public static int sumOfDigits(int number) {

        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(number));

        sc.close();
    }
}