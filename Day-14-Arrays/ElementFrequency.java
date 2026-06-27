import java.util.*;

// // Write a program to Frequency of an element.

public class ElementFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to find its frequency :");
        int key = sc.nextInt();
        int count = 0;

        for ( int i = 0; i < size; i++ ) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of the element is : " + count);

        sc.close();
    }
}