import java.util.*;

// Write a program to Linear search.

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array :");
        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < length; i++ ) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search :");
        int key = sc.nextInt();

        for (int i = 0; i < length; i++) {
            if ( arr[i] == key ) {
                System.out.println("Element found at index : " + i);
                sc.close();
                return;
            }
        }

        System.out.println("Element not found");

        sc.close();
    }
}