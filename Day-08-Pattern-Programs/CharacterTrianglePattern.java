import java.util.*;

/* Write a program to Print character triangle.
   A
   AB
   ABC
   ABCD
   ABCDE */

public class CharacterTrianglePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the character triangle :");
        int rows = sc.nextInt();

        for ( int i = 1; i <= rows; i++ ) {

            char letter = 'A';

            for ( int j = 1; j <= i; j++ ) {
                System.out.print(letter);
                letter++;
            }

            System.out.println();
        }

        sc.close();
    }
}