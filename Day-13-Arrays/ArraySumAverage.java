import java.util.*;

// Write a program to Find sum and average of array.

public class ArraySumAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] array = new int[size];
        int sum = 0;

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        double average = (double) sum / size;

        System.out.println("Sum of the array elements : " + sum);
        System.out.println("Average of the array elements : " + average);

        sc.close();
    }
}