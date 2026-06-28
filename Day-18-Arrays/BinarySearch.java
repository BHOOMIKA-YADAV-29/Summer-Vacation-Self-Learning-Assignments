import java.util.*;

// Write a program to Binary search. 

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the sorted array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search :");
        int key = sc.nextInt();

        int low = 0;
        int high = size - 1;

        while ( low <= high ) {

            int mid = (low + high) / 2;

            if ( arr[mid] == key ) {
                System.out.println("Element found at index " + mid);
                sc.close();
                return;
            }

            if ( arr[mid] < key ) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");

        sc.close();
    }
}