import java.util.*;

public class Palindrome {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = sc.nextInt();
        int ReverseNum = 0;
        int OriginalNumber = number;
           
        while (number > 0 ) {
            int digit = number % 10;
            ReverseNum = digit + ReverseNum*10;
            number = number/10;
        }
            
        if ( OriginalNumber == ReverseNum ) {
            System.out.println( "Given Number is a Palindrome Number");
        }
        else {
            System.out.println("Given Number is not a Palindrome Number");
        } 
        sc.close();
    }
}
