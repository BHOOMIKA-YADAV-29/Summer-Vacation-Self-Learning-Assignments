import java.util.*;

// Write a program to Remove duplicates from array.

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] unique = new int[size];

        System.out.println("Enter the array elements :");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for ( int i = 0; i < size; i++ ) {

            boolean found = false;

            for ( int j = 0; j < count; j++ ) {
                if ( arr[i] == unique[j] ) {
                    found = true;
                    break;
                }
            }

            if ( !found ) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates :");

        for ( int i = 0; i < count; i++ ) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}
