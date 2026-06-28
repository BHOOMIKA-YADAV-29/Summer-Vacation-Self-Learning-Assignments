import java.util.*;

// Write a program to Find maximum frequency element.

public class MaximumFrequencyElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;
        int maxElement = arr[0];

        for ( int i = 0; i < size; i++ ) {

            int count = 1;

            for ( int j = i + 1; j < size; j++ ) {
                if ( arr[i] == arr[j] ) {
                    count++;
                }
            }

            if ( count > maxCount ) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with maximum frequency : " + maxElement);
        System.out.println("Frequency : " + maxCount);

        sc.close();
    }
}
