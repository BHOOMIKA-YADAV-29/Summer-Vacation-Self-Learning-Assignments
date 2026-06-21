import java.util.*;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int originalNumber = number; 
        int numberOfDigits = 0; 
        int sum = 0;

        while ( number > 0 ) 
        {
            numberOfDigits++;
            number /= 10;
        }

        number = originalNumber;

        while ( number > 0 ) {
            sum += Math.pow( number % 10 , numberOfDigits );
            number /= 10;
        }

        if ( originalNumber == sum ) 
        {
            System.out.println("Given number is an armstrong number ");
        } 
        else {
            System.out.println("Given number is not an armstrong number ");
        }

        sc.close();
    }   
}
    

