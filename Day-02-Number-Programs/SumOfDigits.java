import java.util.*;

public class SumOfDigits {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;

        while ( number > 0) {
            sum = number % 10 + sum;
            number = number / 10;
            
        }
        System.out.println(sum);

        sc.close();
    }
    
}
