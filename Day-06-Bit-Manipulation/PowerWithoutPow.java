import java.util.*;

// Write a program to find x^n without using Math.pow().

public class PowerWithoutPow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println(x + "^" + n + " = " + result);

        sc.close();
    }
}