import java.util.*;

// Write a program to Input and display array.

public class ArrayInputDisplay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int[] array = new int[size];
        
        // input array
        System.out.println("Enter the array elements :");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // display array
        System.out.println("The array elements are :");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
