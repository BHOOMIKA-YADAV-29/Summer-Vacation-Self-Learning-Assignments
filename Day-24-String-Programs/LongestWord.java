import java.util.*;

// Write a program to Find longest word. 

public class LongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence :");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String longest = words[0];

        for ( int i = 1; i < words.length; i++ ) {

            if ( words[i].length() > longest.length() ) {
                longest = words[i];
            }
        }

        System.out.println("Longest word : " + longest);
        System.out.println("Length : " + longest.length());

        sc.close();
    }
}