import java.util.*;

// Write a program to Create ATM simulation.

public class ATMSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance : ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit : ");
                    double deposit = sc.nextDouble();

                    if ( deposit > 0 ) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully");
                    } 
                    else {
                        System.out.println("Invalid amount");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw : ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance && withdraw > 0) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash");
                    } 
                    else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 4 );

        sc.close();
    }
}