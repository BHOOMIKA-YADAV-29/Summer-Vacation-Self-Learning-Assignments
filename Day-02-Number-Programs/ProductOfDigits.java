import java.util.*;

public class ProductOfDigits {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 1;

        while (number > 0) {
            product = number % 10 * product;
            number = number / 10;
        }
        System.out.println(product);

        sc.close();

    }
    
}
