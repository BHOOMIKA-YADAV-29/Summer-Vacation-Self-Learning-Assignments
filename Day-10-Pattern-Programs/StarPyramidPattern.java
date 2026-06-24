import java.util.*;

/* Write a program to Print star pyramid.
     *
    ***
   *****
  *******
 *********
 */

public class StarPyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the star pyramid :");
        int height = sc.nextInt();

        for ( int i = 1; i <= height; i++ ) {

            // To print spaces
            for ( int j = 1; j <= height - i; j++ ) {
                System.out.print(" ");
            }

            // To print stars
            for ( int j = 1; j <= 2 * i - 1; j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

