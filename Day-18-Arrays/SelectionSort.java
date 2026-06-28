import java.util.*;

// Write a program to Selection sort.

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        for ( int i = 0; i < size - 1; i++ ) {

            int minIndex = i;

            for ( int j = i + 1; j < size; j++ ) {
                if ( arr[j] < arr[minIndex] ) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted array :");

        for ( int i = 0; i < size; i++ ) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
