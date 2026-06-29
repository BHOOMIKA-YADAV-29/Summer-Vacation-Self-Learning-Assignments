import java.util.*;

// Write a program to Check anagram strings.

public class AnagramStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string :");
        String str1 = sc.nextLine().toLowerCase();

        System.out.println("Enter the second string :");
        String str2 = sc.nextLine().toLowerCase();

        if ( str1.length() != str2.length() ) {
            System.out.println("The strings are not anagrams");
            sc.close();
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort first array
        for ( int i = 0; i < arr1.length - 1; i++ ) {
            for ( int j = 0; j < arr1.length - i - 1; j++ ) {
                if ( arr1[j] > arr1[j + 1] ) {
                    char temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        // Sort second array
        for ( int i = 0; i < arr2.length - 1; i++ ) {
            for ( int j = 0; j < arr2.length - i - 1; j++ ) {
                if ( arr2[j] > arr2[j + 1] ) {
                    char temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        boolean anagram = true;

        for ( int i = 0; i < arr1.length; i++ ) {
            if ( arr1[i] != arr2[i] ) {
                anagram = false;
                break;
            }
        }

        if ( anagram ) {
            System.out.println("The strings are anagrams");
        } 
        else {
            System.out.println("The strings are not anagrams");
        }

        sc.close();
    }
}