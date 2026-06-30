import java.util.*;

// Write a program to find factorial using recursion.

public class RecursiveFactorial {

    public static int factorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Factorial = " + factorial(number));

        sc.close();
    }
}