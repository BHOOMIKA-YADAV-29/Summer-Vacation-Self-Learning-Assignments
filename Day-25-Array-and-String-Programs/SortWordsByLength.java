import java.util.*;

// Write a program to Sort words by length.

public class SortWordsByLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence :");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        // Bubble Sort based on word length
        for ( int i = 0; i < words.length - 1; i++ ) {

            for ( int j = 0; j < words.length - i - 1; j++ ) {

                if ( words[j].length() > words[j + 1].length() ) {

                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words sorted by length :");

        for ( int i = 0; i < words.length; i++ ) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}