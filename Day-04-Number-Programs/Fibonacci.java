import java.util.*;

public class Fibonacci 
{
        public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms in fibonacci series ");
        int number = sc.nextInt();
        int firstTerm = 0; 
        int secondTerm = 1;
        int nextTerm;

        System.out.print( firstTerm + " ");

        if ( number > 1 ) 
        {
            System.out.print( secondTerm + " ");
        }

        for ( int i = 3; i <= number; i++ ) 
        {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.print( nextTerm + " ");
        }
        sc.close();

    }
}
