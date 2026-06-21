import java.util.*;

// Write a program to Check perfect number.
public class PerfectNumber {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int sum = 1;

        for ( int i = 2; i < number; i++ ) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if ( number > 1 && sum == number ) {
            System.out.println("It is a Perfect Number");
        } else {
            System.out.println("It is not a Perfect Number");
        }

        sc.close();
    }
}
