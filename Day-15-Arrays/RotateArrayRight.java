import java.util.*;

// Write a program to Rotate array right.

public class RotateArrayRight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        int last = arr[size - 1];

        for ( int i = size - 1; i > 0; i-- ) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("Array after right rotation :");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
