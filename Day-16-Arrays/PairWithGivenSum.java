import java.util.*;

// Write a program to Find pair with given sum.

public class PairWithGivenSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum :");
        int target = sc.nextInt();

        boolean found = false;

        for ( int i = 0; i < size; i++ ) {
            for ( int j = i + 1; j < size; j++ ) {
                if ( arr[i] + arr[j] == target ) {
                    System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
