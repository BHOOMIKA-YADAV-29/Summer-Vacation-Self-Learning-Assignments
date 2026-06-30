import java.util.*;

// Write a program to convert decimal to binary.

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        if (decimal == 0) {
            System.out.println("Binary number: 0");
        } else {

            int binary = 0;
            int place = 1;

            while (decimal > 0) {

                int remainder = decimal % 2;
                binary = binary + (remainder * place);

                place = place * 10;
                decimal = decimal / 2;
            }

            System.out.println("Binary number: " + binary);
        }

        sc.close();
    }
}