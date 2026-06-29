import java.util.*;

// Write a program to Reverse a string. 

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = sc.nextLine();

        String reverse = "";

        for ( int i = str.length() - 1; i >= 0; i-- ) {
            reverse += str.charAt(i);
        }

        System.out.println("Reversed string : " + reverse);

        sc.close();
    }
}
