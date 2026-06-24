import java.util.*;

/* Write a program to Print character pyramid. 
       A
      ABA
     ABCBA
    ABCDCBA
   ABCDEDCBA 
*/

public class CharacterPyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the character pyramid :");
        int height = sc.nextInt();

        for ( int i = 1; i <= height; i++ ) {

            // Print spaces
            for ( int j = 1; j <= height - i; j++ ) {
                System.out.print(" ");
            }

            // Print ascending characters
            for ( char letter = 'A'; letter < 'A' + i; letter++ ) {
                System.out.print(letter);
            }

            // Print descending characters
            for ( char letter = (char) ('A' + i - 2); letter >= 'A'; letter-- ) {
                System.out.print(letter);
            }

            System.out.println();
        }

        sc.close();
    }
}
