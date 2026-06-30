import java.util.*;

// Write a program to Create menu-driven calculator.

public class MenuDrivenCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double num1, num2;

        do {

            System.out.println("\n===== MENU-DRIVEN CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    System.out.print("Enter first number : ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number : ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:

                    System.out.print("Enter first number : ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number : ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:

                    System.out.print("Enter first number : ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number : ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:

                    System.out.print("Enter first number : ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number : ");
                    num2 = sc.nextDouble();

                    if ( num2 != 0 ) {
                        System.out.println("Result = " + (num1 / num2));
                    } 
                    else {
                        System.out.println("Division by zero is not allowed");
                    }

                    break;

                case 5:

                    System.out.println("Thank you for using the calculator");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 5 );

        sc.close();
    }
}