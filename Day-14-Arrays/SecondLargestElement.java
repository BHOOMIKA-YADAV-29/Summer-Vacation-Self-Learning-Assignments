import java.util.*;

// Write a program to find the Second largest element.

public class SecondLargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        // Find largest
        for ( int i = 0; i < size; i++ ) {
            if ( arr[i] > largest ) {
                largest = arr[i];
            }
        }

        // Find second largest
        for ( int i = 0; i < size; i++ ) {
            if ( arr[i] > secondLargest && arr[i] != largest ) {
                secondLargest = arr[i];
            }
        }

        if ( secondLargest == Integer.MIN_VALUE ) {
            System.out.println("There is no second largest element");
        } 
        else {
            System.out.println("The second largest element is : " + secondLargest);
        }

        sc.close();
    }
}