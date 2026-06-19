import java.util.*;

public class Prime {

    public static void main(String args[]) {
        // Check whether given number is a prime number or not
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = sc.nextInt();
        int count = 0;

        for ( int i = 1; i <= number; i++) {
            if ( number % i == 0) {
                
                count ++;
            }     

        }
        if ( count ==2 ) {
            System.out.println("Given number is a Prime number");
        }
        else {
            System.out.println("Given number is not a Prime number");
        }
        sc.close();
    }
    
}