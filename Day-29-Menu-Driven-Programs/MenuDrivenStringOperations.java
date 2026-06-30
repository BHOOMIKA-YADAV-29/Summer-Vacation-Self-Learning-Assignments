import java.util.*;

// Write a program to Create menu-driven string operations system.

public class MenuDrivenStringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        int choice;

        do {

            System.out.println("\n===== MENU-DRIVEN STRING OPERATIONS =====");
            System.out.println("1. Display String");
            System.out.println("2. Find String Length");
            System.out.println("3. Reverse String");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    System.out.println("String : " + str);
                    break;

                case 2:

                    System.out.println("Length of the string : " + str.length());
                    break;

                case 3:

                    String reverse = "";

                    for ( int i = str.length() - 1; i >= 0; i-- ) {
                        reverse += str.charAt(i);
                    }

                    System.out.println("Reversed String : " + reverse);
                    break;

                case 4:

                    System.out.println("Uppercase String : " + str.toUpperCase());
                    break;

                case 5:

                    System.out.println("Exiting String Operations System...");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 5 );

        sc.close();
    }
}