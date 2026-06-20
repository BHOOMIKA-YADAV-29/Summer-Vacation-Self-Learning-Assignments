import java.util.*;

public class LCM {

    public static void main(String args[]) {
        // Write a program to find LCM of two numbers
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int lcm = 1;
        // LCM is the minimum number which is divided by both of the numbers
        if( number1 > number2 ) {
            for( int i = number1; i <= number1*number2; i++ ) {
                if( i % number1 ==0 && i % number2 ==0 ) {
                    lcm = i;
                    break;
                }
            }
        }
        else  {
            for( int i = number2; i <= number1*number2; i++ )  {
                if( i % number1 ==0 && i % number2 ==0) {
                    lcm = i;
                    break;
                }
            }
        }    

        System.out.println("LCM of given numbers is: " + lcm);
        sc.close();
        
    }
    
}
