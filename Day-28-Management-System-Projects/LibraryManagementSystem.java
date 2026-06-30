import java.util.*;

// Write a program to Create library management system.

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int bookId = 0;
        String bookName = "";
        String author = "";
        boolean bookAvailable = false;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Book ID : ");
                    bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name : ");
                    bookName = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    author = sc.nextLine();

                    bookAvailable = true;

                    System.out.println("Book added successfully");
                    break;

                case 2:

                    if ( bookId != 0 ) {

                        System.out.println("\nBook Details");
                        System.out.println("Book ID : " + bookId);
                        System.out.println("Book Name : " + bookName);
                        System.out.println("Author : " + author);

                        if ( bookAvailable ) {
                            System.out.println("Status: Available");
                        } 
                        else {
                            System.out.println("Status: Issued");
                        }

                    } 
                    else {
                        System.out.println("No book record found");
                    }

                    break;

                case 3:

                    if ( bookId == 0 ) {
                        System.out.println("No book record found");
                    } 
                    else if ( bookAvailable ) {
                        bookAvailable = false;
                        System.out.println("Book issued successfully");
                    } 
                    else {
                        System.out.println("Book is already issued");
                    }

                    break;

                case 4:

                    if ( bookId == 0 ) {
                        System.out.println("No book record found");
                    } 
                    else if ( !bookAvailable ) {
                        bookAvailable = true;
                        System.out.println("Book returned successfully");
                    } 
                    else {
                        System.out.println("Book is already available");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Library Management System...");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 5 );

        sc.close();
    }
}