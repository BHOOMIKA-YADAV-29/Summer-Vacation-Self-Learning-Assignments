import java.util.*;

public class MultiplicationTable {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int number = 1; number < 11; number++) {
              System.out.println( n * number);
        
        }
        sc.close();

    }  

}


