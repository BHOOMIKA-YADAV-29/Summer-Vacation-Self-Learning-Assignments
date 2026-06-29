import java.util.*;

// Write a program to Find common characters in strings.

public class CommonCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string :");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string :");
        String str2 = sc.nextLine();

        System.out.println("Common characters :");

        String printed = "";

        for ( int i = 0; i < str1.length(); i++ ) {

            char ch = str1.charAt(i);

            boolean found = false;

            // Check if character exists in second string
            for ( int j = 0; j < str2.length(); j++ ) {

                if ( ch == str2.charAt(j) ) {
                    found = true;
                    break;
                }
            }

            // Check if already printed
            boolean alreadyPrinted = false;

            for ( int k = 0; k < printed.length(); k++ ) {

                if ( ch == printed.charAt(k) ) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if ( found && !alreadyPrinted ) {
                System.out.print(ch + " ");
                printed += ch;
            }
        }

        sc.close();
    }
}