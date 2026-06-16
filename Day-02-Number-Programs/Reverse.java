import java.util.*;

public class Reverse { 

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = digit + reverse*10;
            number = number/10;
        } 

        System.out.println(reverse);
        sc.close();

    }
    
}
