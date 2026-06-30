import java.util.*;

// Write a program to print Armstrong numbers in a range.

public class ArmstrongInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range of the Armstrong numbers: ");
        int range = sc.nextInt();

        System.out.println("Armstrong numbers are:");

        for (int i = 0; i <= range; i++) {

            if (i == 0) {
                System.out.print("0 ");
                continue;
            }

            int numberOfDigits = 0;
            int sum = 0;
            int originalNumber = i;

            // Count the number of digits
            while (originalNumber > 0) {
                numberOfDigits++;
                originalNumber /= 10;
            }

            originalNumber = i;

            // Calculate the Armstrong sum
            while (originalNumber > 0) {
                int digit = originalNumber % 10;
                sum += (int) Math.pow(digit, numberOfDigits);
                originalNumber /= 10;
            }

            if (i == sum) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}