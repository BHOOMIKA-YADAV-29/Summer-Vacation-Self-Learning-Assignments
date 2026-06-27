import java.util.*;

public class ArrayLargestSmallest {

// Write a program to Find largest and smallest element.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            array[i] = sc.nextInt();
        }

        int largest = array[0];
        int smallest = array[0];

        for ( int i = 1; i < size; i++ ) {
            if ( array[i] > largest ) {
                largest = array[i];
            }

            if ( array[i] < smallest ) {
                smallest = array[i];
            }
        }

        System.out.println("Largest element of array is : " + largest);
        System.out.println("Smallest element of array is : " + smallest);

        sc.close();
    }
}