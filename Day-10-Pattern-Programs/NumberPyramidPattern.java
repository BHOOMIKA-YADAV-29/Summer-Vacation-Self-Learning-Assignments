import java.util.*;

/* Write a program to Print number pyramid.
       1
      121
     12321
    1234321
   123454321 
*/

public class NumberPyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the number pyramid :");
        int height = sc.nextInt();

        for ( int i = 1; i <= height; i++ ) {

            // Print spaces
            for ( int j = 1; j <= height - i; j++ ) {
                System.out.print(" ");
            }

            // Print ascending numbers
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(j);
            }

            // Print descending numbers
            for ( int j = i - 1; j >= 1; j-- ) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}