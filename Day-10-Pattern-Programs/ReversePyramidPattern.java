import java.util.*;

/* Write a program to Print reverse pyramid.
   *********
    *******
     *****
      ***
       * 
*/

public class ReversePyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the reverse star pyramid :");
        int height = sc.nextInt();

        for ( int i = height; i >= 1; i-- ) {

            // Print spaces
            for ( int j = 1; j <= height - i; j++ ) {
                System.out.print(" ");
            }

            // Print stars
            for ( int j = 1; j <= 2 * i - 1; j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}