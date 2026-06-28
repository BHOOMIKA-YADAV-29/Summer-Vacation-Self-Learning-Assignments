import java.util.*;

// Write a program to Bubble sort.

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for ( int i = 0; i < size - 1; i++ ) {
            for ( int j = 0; j < size - i - 1; j++ ) {
                if ( arr[j] > arr[j + 1] ) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        System.out.println("Sorted array :");

        for ( int i = 0; i < size; i++ ) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
