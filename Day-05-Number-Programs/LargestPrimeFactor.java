import java.util.*;

// Write a program to Find largest prime factor.
public class LargestPrimeFactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if ( number <= 1 ) {
            System.out.println("Given number has no prime factors");
            sc.close();
            return;
        }

        int largestPrimeFactor = 1;

        for ( int i = 2; i <= number; i++ ) {

            if ( number % i == 0 ) {

                int count = 0;

                for ( int j = 1; j <= i; j++ ) {
                    if ( i % j == 0 ) {
                        count++;
                    }
                }

                if ( count == 2 ) {
                    largestPrimeFactor = i;
                }
            }
        }

        System.out.println("Largest Prime Factor of " + number + " is :" + largestPrimeFactor );

        sc.close();
    }
}
