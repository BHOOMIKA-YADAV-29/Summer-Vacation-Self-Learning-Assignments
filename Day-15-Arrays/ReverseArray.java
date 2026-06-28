import java.util.*;

// Write a program to Reverse array.

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array :");

        for ( int i = size - 1; i >= 0; i-- ) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
