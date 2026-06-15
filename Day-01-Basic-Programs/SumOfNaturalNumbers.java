import java.util.*;

public class SumOfNaturalNumbers {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for( int number = 1; number <= n; number ++) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

}
 






