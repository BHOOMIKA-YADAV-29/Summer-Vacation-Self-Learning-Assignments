import java.util.*;

// Write a program to Find duplicates in array.

public class ArrayDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        int[] dupArr = new int[size];
        int count = 0;

        for ( int i = 0; i < size; i++ ) {

            boolean found = false;

            // check if already stored
            for ( int k = 0; k < count; k++ ) {
                if ( arr[i] == dupArr[k] ) {
                    found = true;
                    break;
                }
            }

            if (found) continue;

            // check duplicates in remaining array
            for ( int j = i + 1; j < size; j++ ) {
                if ( arr[i] == arr[j] ) {
                    dupArr[count++] = arr[i];
                    break;
                }
            }
        }

        if ( count == 0 ) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicate elements are :");
            for ( int i = 0; i < count; i++ ) {
                System.out.print(dupArr[i] + " ");
            }
        }

        sc.close();
    }
}