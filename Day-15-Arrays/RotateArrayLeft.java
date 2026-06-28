import java.util.*;

// Write a program to Rotate array left.

public class RotateArrayLeft {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];

        for ( int i = 0; i < size - 1; i++ ) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = first;

        System.out.println("Array after left rotation :");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
