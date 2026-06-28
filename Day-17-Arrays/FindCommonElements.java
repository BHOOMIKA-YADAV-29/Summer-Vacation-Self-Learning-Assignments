import java.util.*;

// Write a program to Find common elements. 

public class FindCommonElements {

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

        int[] common = new int[Math.min(size1, size2)];
        int count = 0;

        for ( int i = 0; i < size1; i++ ) {

            for ( int j = 0; j < size2; j++ ) {

                if ( arr1[i] == arr2[j] ) {

                    boolean found = false;

                    for ( int k = 0; k < count; k++ ) {
                        if ( common[k] == arr1[i] ) {
                            found = true;
                            break;
                        }
                    }

                    if ( !found ) {
                        common[count++] = arr1[i];
                    }

                    break;
                }
            }
        }

        if ( count == 0 ) {
            System.out.println("No common elements found");
        } 
        else {
            System.out.println("Common elements are :");

            for ( int i = 0; i < count; i++ ) {
                System.out.print(common[i] + " ");
            }
        }

        sc.close();
    }
}