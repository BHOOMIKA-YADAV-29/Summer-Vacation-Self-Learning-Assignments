import java.util.*;

// Write a program to Write function for Fibonacci.

public class FunctionFibonacci {

    public static void printFibonacci(int terms) {

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series : ");

        for ( int i = 1; i <= terms; i++ ) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms :");
        int terms = sc.nextInt();

        if ( terms <= 0 ) {
            System.out.println("Enter a positive number of terms");
        } 
        else {
            printFibonacci(terms);
        }

        sc.close();
    }
}
