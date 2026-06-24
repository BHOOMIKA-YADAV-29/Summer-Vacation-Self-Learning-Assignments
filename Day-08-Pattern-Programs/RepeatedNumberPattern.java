import java.util.*;

/* Write a program to Print repeated-number pattern.
   1
   22
   333
   4444
   55555 */

public class RepeatedNumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the repeated number pattern :");
        int rows = sc.nextInt();

        for ( int i = 1; i <= rows; i++ ) {

            for ( int j = 1; j <= i; j++ ) {
                System.out.print(i);
            }

            System.out.println();
        }

        sc.close();
    }
}
