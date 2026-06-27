import java.util.*;

// Write a program to Count even and odd elements.

public class ArrayEvenOddCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] array = new int[size];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter the array elements :");

        for ( int i = 0; i < size; i++ ) {
            array[i] = sc.nextInt();

            if ( array[i] % 2 == 0 ) {
                evenCount++;
            } 
            else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements : " + evenCount);
        System.out.println("Number of odd elements : " + oddCount);

        sc.close();
    }
}