import java.util.*;

// Write a program to Find missing number in array.

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = (size + 1) * (size + 2) / 2;
        int actualSum = 0;

        for ( int i = 0; i < size; i++ ) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is : " + missingNumber);

        sc.close();
    }
}
