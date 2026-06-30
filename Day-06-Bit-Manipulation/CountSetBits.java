import java.util.*;

// Write a program to count set bits in a number.

public class CountSetBits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        while (number > 0) {

            if (number % 2 == 1) {
                count++;
            }

            number = number / 2;
        }

        System.out.println("Number of set bits: " + count);

        sc.close();
    }
}