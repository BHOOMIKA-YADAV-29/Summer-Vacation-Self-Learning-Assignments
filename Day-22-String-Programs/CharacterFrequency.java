import java.util.*;

// Write a program to Character frequency.  

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = sc.nextLine();

        System.out.println("Character frequencies :");

        for ( int i = 0; i < str.length(); i++ ) {

            char ch = str.charAt(i);
            int count = 1;

            boolean counted = false;

            for ( int k = 0; k < i; k++ ) {
                if ( ch == str.charAt(k) ) {
                    counted = true;
                    break;
                }
            }

            if ( counted ) {
                continue;
            }

            // Count frequency
            for ( int j = i + 1; j < str.length(); j++ ) {
                if ( ch == str.charAt(j) ) {
                    count++;
                }
            }

            System.out.println(ch + " : " + count);
        }

        sc.close();
    }
}