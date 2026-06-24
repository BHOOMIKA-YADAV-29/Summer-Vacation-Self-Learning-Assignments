import java.util.*;

/* Write a program to Print repeated character
pattern.
A
BB
CCC
DDDD
EEEEE */

public class RepeatedCharacterPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the repeated character pattern :");
        int rows = sc.nextInt();

        char letter = 'A';

        for ( int i = 1; i <= rows; i++ ) {

            for ( int j = 1; j <= i; j++ ) {
                System.out.print(letter);
            }
            letter++;

            System.out.println();
        }

        sc.close();
    }
}
