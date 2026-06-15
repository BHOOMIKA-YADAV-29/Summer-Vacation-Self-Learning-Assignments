import java.util.*;

public class Factorial {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long factorial = 1;

        for ( int number = 1; number <= n; number++ ) {
            factorial = factorial * number;
            
        }
        System.out.println(factorial);
        sc.close();

    }

}
