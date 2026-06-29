import java.util.*;

// Write a program to Count words in a sentence.

public class CountWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence :");
        String str = sc.nextLine();

        int words = 0;

        if ( str.length() > 0 ) {
            words = 1;

            for ( int i = 0; i < str.length(); i++ ) {
                if ( str.charAt(i) == ' ' ) {
                    words++;
                }
            }
        }

        System.out.println("Number of words : " + words);

        sc.close();
    }
}