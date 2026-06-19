import java.util.*;

public class GCD {

    public static void main(String args[]) {
        // Write a program to find GCD of two numbers
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1 :");
        System.out.println("Enter number2 :");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int gcd = 1;
        // gcd is the greatest number which can divide both of the numbers
        if ( number1 > number2 ) {
            for( int i = 1; i <= number1; i++) {
                if ( number1 % i==0 && number2 % i==0 ) {

                    gcd = i;
                }
            }
        }
        else
        {
            for( int i = 1; i <= number2; i++) {
                if (number1 % i==0 && number2 % i==0 ) {

                    gcd = i;
                }
            }
        }
        System.out.println("GCD of given numbers is :" + gcd);
        sc.close();
    }

}
