import java.util.*;

public class PrimeInRange {

    public static void main(String args[]) {
        // Write a program to print prime numbers in a range.
        System.out.println("Enter the number upto which prime numbers should be printed ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Exclude 0 & 1 as they are not prime numbers
        for ( int i = 2; i <= number; i++ ) {
            int count = 0;
            
            for( int j = 1; j <= i; j++ ) {
                if( i % j ==0 )  {

                    count++;
                }
            }
            if( count == 2 ) {
                System.out.print( i+ " ");
            }
        }

            sc.close();
            
    }
    
}
