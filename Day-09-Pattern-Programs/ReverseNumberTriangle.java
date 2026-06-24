import java.util.*;

/* Write a program to Print reverse number
triangle.
12345
1234
123
12
1 
*/

public class ReverseNumberTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of Reverse Number Triangle :");
        int rows = sc.nextInt();

        for ( int i = rows; i >= 1; i-- ) {

            for ( int j = 1; j <= i; j++ ) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}