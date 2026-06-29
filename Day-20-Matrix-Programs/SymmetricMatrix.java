import java.util.*;

// Write a program to Check symmetric matrix.

public class SymmetricMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of the square matrix :");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix :");

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;

        // Check if the matrix is symmetric
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( matrix[i][j] != matrix[j][i] ) {
                    symmetric = false;
                    break;
                }
            }
            if ( !symmetric ) {
                break;
            }
        }

        if ( symmetric ) {
            System.out.println("The matrix is symmetric");
        } 
        else {
            System.out.println("The matrix is not symmetric");
        }

        sc.close();
    }
}
