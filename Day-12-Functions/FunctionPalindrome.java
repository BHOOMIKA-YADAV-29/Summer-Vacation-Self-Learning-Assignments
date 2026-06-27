import java.util.*;

// Write a program to Write function for palindrome.

public class FunctionPalindrome {

    public static void checkPalindrome(int number) {

        int originalNumber = number;
        int reverse = 0;

        while ( number > 0 ) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        if ( originalNumber == reverse ) {
            System.out.println("The given number is a Palindrome");
        } 
        else {
            System.out.println("The given number is not a Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = sc.nextInt();

        checkPalindrome(number);

        sc.close();
    }
}
