import java.util.*;

public class NthFibonacci {

    public static void main(String args[]) {

        // Write a program to Find nth Fibonacci term
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n of nth Fibonacci term :");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;

        if (n == 1) 
        {
            System.out.println("The nth term of the fibonacci is :" + firstTerm);
        } 

        else if (n == 2) 
        {
            System.out.println("The nth term of the fibonacci is :" + secondTerm);
        } 
        else 
        {
            for ( int i = 3; i <= n; i++ ) 
            {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            }
            System.out.println("The nth term of fibonacci series is :" + nextTerm);
        }
        
        sc.close();
    }
}


    


