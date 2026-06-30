import java.util.*;

// Write a program to Create menu-driven array operations system.

public class MenuDrivenArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {

            System.out.println("\n===== MENU-DRIVEN ARRAY OPERATIONS =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Largest Element");
            System.out.println("4. Search an Element");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    System.out.print("Array Elements : ");

                    for ( int i = 0; i < size; i++ ) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                    break;

                case 2:

                    int sum = 0;

                    for ( int i = 0; i < size; i++ ) {
                        sum += arr[i];
                    }

                    System.out.println("Sum of array elements : " + sum);
                    break;

                case 3:

                    int largest = arr[0];

                    for ( int i = 1; i < size; i++ ) {
                        if ( arr[i] > largest ) {
                            largest = arr[i];
                        }
                    }

                    System.out.println("Largest element : " + largest);
                    break;

                case 4:

                    System.out.print("Enter element to search : ");
                    int key = sc.nextInt();

                    boolean found = false;

                    for ( int i = 0; i < size; i++ ) {

                        if ( arr[i] == key ) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if ( !found ) {
                        System.out.println("Element not found");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Array Operations System...");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 5 );

        sc.close();
    }
}