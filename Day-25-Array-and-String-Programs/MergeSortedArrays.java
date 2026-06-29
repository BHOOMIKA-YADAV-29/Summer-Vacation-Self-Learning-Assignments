import java.util.*;

// Write a program to Merge two sorted arrays.

public class MergeSortedArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first sorted array :");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter the elements of the first sorted array :");

        for ( int i = 0; i < size1; i++ ) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second sorted array :");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter the elements of the second sorted array :");

        for ( int i = 0; i < size2; i++ ) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[size1 + size2];

        int i = 0, j = 0, k = 0;

        while ( i < size1 && j < size2 ) {

            if ( arr1[i] <= arr2[j] ) {
                merged[k] = arr1[i];
                i++;
            } 
            else {
                merged[k] = arr2[j];
                j++;
            }

            k++;
        }

        while ( i < size1 ) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while ( j < size2 ) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged sorted array :");

        for ( int x = 0; x < merged.length; x++ ) {
            System.out.print(merged[x] + " ");
        }

        sc.close();
    }
}