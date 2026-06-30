import java.util.*;

// Write a program to Create contact management system.

public class ContactManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        String name = "";
        String phoneNumber = "";
        boolean contactExists = false;

        do {

            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Update Phone Number");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Contact Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Phone Number : ");
                    phoneNumber = sc.nextLine();

                    contactExists = true;

                    System.out.println("Contact added successfully");
                    break;

                case 2:

                    if ( contactExists ) {

                        System.out.println("\nContact Details");
                        System.out.println("Name         : " + name);
                        System.out.println("Phone Number : " + phoneNumber);

                    } 
                    else {
                        System.out.println("No contact found");
                    }

                    break;

                case 3:

                    if ( contactExists ) {

                        sc.nextLine();

                        System.out.print("Enter New Phone Number : ");
                        phoneNumber = sc.nextLine();

                        System.out.println("Phone number updated successfully");

                    } 
                    else {
                        System.out.println("No contact found");
                    }

                    break;

                case 4:

                    if ( contactExists ) {
                        contactExists = false;
                        name = "";
                        phoneNumber = "";
                        System.out.println("Contact deleted successfully");
                    } 
                    else {
                        System.out.println("No contact found");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Contact Management System...");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 5 );

        sc.close();
    }
}