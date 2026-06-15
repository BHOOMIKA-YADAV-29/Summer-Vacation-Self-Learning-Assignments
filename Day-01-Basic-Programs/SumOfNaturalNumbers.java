import java.util.*;

public class SumOfNaturalNumbers {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        for( int number = 1; number <= N; number ++) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

}
 






