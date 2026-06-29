import java.util.*;

// Write a program to Create voting eligibility system.

public class VotingEligibilitySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if ( age >= 18 ) {
            System.out.println(name + ", You are eligible to vote");
        } 
        else {
            System.out.println(name + ", You are not eligible to vote");
        }

        sc.close();
    }
}