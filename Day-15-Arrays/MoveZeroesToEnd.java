import java.util.*;

// Write a program to Move zeroes to end.

public class MoveZeroesToEnd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for ( int i = 0; i < size; i++ ) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while ( index < size ) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeroes to the end :");

        for ( int i = 0; i < size; i++ ) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
