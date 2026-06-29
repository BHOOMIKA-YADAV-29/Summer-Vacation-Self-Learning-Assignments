import java.util.*;

// Write a program to Find column-wise sum

public class ColumnWiseSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns :");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix :");

        for ( int i = 0; i < rows; i++ ) {
            for ( int j = 0; j < cols; j++ ) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Column-wise sums :");

        for ( int j = 0; j < cols; j++ ) {

            int sum = 0;

            for ( int i = 0; i < rows; i++ ) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }

        sc.close();
    }
}
