import java.util.*;

// Write a program to Find diagonal sum.

public class DiagonalSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of the square matrix :");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix :");

        for ( int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int diagonalSum = 0;

        // Find the sum of the principal diagonal
        for ( int i = 0; i < n; i++ ) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Sum of the diagonal elements : " + diagonalSum);

        sc.close();
    }
}
