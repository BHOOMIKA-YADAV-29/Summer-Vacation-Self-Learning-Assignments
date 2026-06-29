import java.util.*;

// Write a program to Compress a string. 

public class StringCompression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = sc.nextLine();

        String compressed = "";

        int count = 1;

        for ( int i = 0; i < str.length(); i++ ) {

            if ( i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1) ) {
                count++;
            } 
            else {
                compressed += str.charAt(i);
                compressed += count;
                count = 1;
            }
        }

        System.out.println("Compressed string : " + compressed);

        sc.close();
    }
}
