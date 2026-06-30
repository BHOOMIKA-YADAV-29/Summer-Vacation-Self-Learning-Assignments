import java.util.*;

// Write a program to reverse a number using recursion.

public class RecursiveReverseNumber {

    static int reverse = 0;

    public static void reverseNumber(int number) {

        if (number == 0) {
            return;
        }

        reverse = reverse * 10 + (number % 10);

        reverseNumber(number / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        reverseNumber(number);

        System.out.println("Reversed number = " + reverse);

        sc.close();
    }
}