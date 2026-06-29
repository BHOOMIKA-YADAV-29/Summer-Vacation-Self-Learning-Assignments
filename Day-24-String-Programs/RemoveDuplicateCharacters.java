import java.util.*;

// Write a program to Remove duplicate characters.

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = sc.nextLine();

        String result = "";

        for ( int i = 0; i < str.length(); i++ ) {

            char ch = str.charAt(i);

            boolean found = false;

            for ( int j = 0; j < result.length(); j++ ) {

                if ( ch == result.charAt(j) ) {
                    found = true;
                    break;
                }
            }

            if ( !found ) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicate characters : " + result);

        sc.close();
    }
}
