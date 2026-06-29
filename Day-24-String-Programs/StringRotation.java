import java.util.*;

// Write a program to Check string rotation.

public class StringRotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string :");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string :");
        String str2 = sc.nextLine();

        if ( str1.length() != str2.length() ) {
            System.out.println("The strings are not rotations");
            sc.close();
            return;
        }

        String temp = str1 + str1;

        if ( temp.contains(str2) ) {
            System.out.println("The strings are rotations of each other");
        } 
        else {
            System.out.println("The strings are not rotations");
        }

        sc.close();
    }
}