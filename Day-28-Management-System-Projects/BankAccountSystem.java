import java.util.*;

// Write a program to Create bank account system.

public class BankAccountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int accountNumber = 0;
        String accountHolder = "";
        double balance = 0;
        boolean accountExists = false;

        do {

            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Account Number : ");
                    accountNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name : ");
                    accountHolder = sc.nextLine();

                    System.out.print("Enter Initial Balance : ");
                    balance = sc.nextDouble();

                    accountExists = true;

                    System.out.println("Bank account created successfully");
                    break;

                case 2:

                    if ( accountExists ) {

                        System.out.println("\nAccount Details");
                        System.out.println("Account Number : " + accountNumber);
                        System.out.println("Account Holder : " + accountHolder);
                        System.out.println("Balance        : ₹" + balance);

                    } 
                    else {
                        System.out.println("No account found");
                    }

                    break;

                case 3:

                    if ( accountExists ) {

                        System.out.print("Enter amount to deposit : ");
                        double deposit = sc.nextDouble();

                        if ( deposit > 0 ) {
                            balance += deposit;
                            System.out.println("Amount deposited successfully");
                        } 
                        else {
                            System.out.println("Invalid amount");
                        }

                    } 
                    else {
                        System.out.println("No account found");
                    }

                    break;

                case 4:

                    if ( accountExists ) {

                        System.out.print("Enter amount to withdraw : ");
                        double withdraw = sc.nextDouble();

                        if ( withdraw > 0 && withdraw <= balance ) {
                            balance -= withdraw;
                            System.out.println("Amount withdrawn successfully");
                        } 
                        else {
                            System.out.println("Insufficient balance or invalid amount");
                        }

                    } 
                    else {
                        System.out.println("No account found");
                    }

                    break;

                case 5:

                    System.out.println("Thank you for using the Bank Account System");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        }
        while ( choice != 5 );

        sc.close();
    }
}