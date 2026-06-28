import java.util.*;

// Write a program to Union of arrays. 

public class UnionOfArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array :");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter the elements of the first array :");

        for ( int i = 0; i < size1; i++ ) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array :");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter the elements of the second array :");

        for ( int i = 0; i < size2; i++ ) {
            arr2[i] = sc.nextInt();
        }

        int[] union = new int[size1 + size2];
        int count = 0;

        for ( int i = 0; i < size1; i++ ) {

            boolean found = false;

            for ( int j = 0; j < count; j++ ) {
                if ( arr1[i] == union[j] ) {
                    found = true;
                    break;
                }
            }

            if ( !found ) {
                union[count++] = arr1[i];
            }
        }

        for ( int i = 0; i < size2; i++ ) {

            boolean found = false;

            for ( int j = 0; j < count; j++ ) {
                if ( arr2[i] == union[j] ) {
                    found = true;
                    break;
                }
            }

            if ( !found ) {
                union[count++] = arr2[i];
            }
        }

        System.out.println("Union of the arrays :");

        for (int i = 0; i < count; i++) {
            System.out.print(union[i] + " ");
        }

        sc.close();
    }
}