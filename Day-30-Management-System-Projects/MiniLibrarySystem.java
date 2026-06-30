import java.util.*;

public class MiniLibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int size = sc.nextInt();
        sc.nextLine();

        int[] bookId = new int[size];
        String[] bookName = new String[size];
        boolean[] available = new boolean[size];

        int choice;

        do {

            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Books");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    for (int i = 0; i < size; i++) {

                        System.out.println("\nEnter details of Book " + (i + 1));

                        System.out.print("Book ID: ");
                        bookId[i] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Book Name: ");
                        bookName[i] = sc.nextLine();

                        available[i] = true;
                    }

                    System.out.println("Books added successfully.");
                    break;

                case 2:

                    System.out.println("\nLibrary Books");

                    for (int i = 0; i < size; i++) {

                        System.out.println("----------------------------");
                        System.out.println("Book ID   : " + bookId[i]);
                        System.out.println("Book Name : " + bookName[i]);

                        if (available[i]) {
                            System.out.println("Status    : Available");
                        } else {
                            System.out.println("Status    : Issued");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to issue: ");
                    int id = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < size; i++) {

                        if (bookId[i] == id) {

                            found = true;

                            if (available[i]) {
                                available[i] = false;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to return: ");
                    id = sc.nextInt();

                    found = false;

                    for (int i = 0; i < size; i++) {

                        if (bookId[i] == id) {

                            found = true;

                            if (!available[i]) {
                                available[i] = true;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book is already available.");
                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Mini Library System...");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}