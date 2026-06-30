import java.util.*;

// Write a program to Create inventory management system.

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int productId = 0;
        String productName = "";
        int quantity = 0;
        boolean productExists = false;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Product ID : ");
                    productId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    productName = sc.nextLine();

                    System.out.print("Enter Quantity : ");
                    quantity = sc.nextInt();

                    productExists = true;

                    System.out.println("Product added successfully");
                    break;

                case 2:

                    if ( productExists ) {

                        System.out.println("\nProduct Details");
                        System.out.println("Product ID   : " + productId);
                        System.out.println("Product Name : " + productName);
                        System.out.println("Quantity     : " + quantity);

                    } 
                    else {
                        System.out.println("No product found");
                    }

                    break;

                case 3:

                    if ( productExists ) {

                        System.out.print("Enter New Quantity : ");
                        quantity = sc.nextInt();

                        System.out.println("Quantity updated successfully");

                    } 
                    else {
                        System.out.println("No product found");
                    }

                    break;

                case 4:

                    if ( productExists ) {

                        productExists = false;
                        productId = 0;
                        productName = "";
                        quantity = 0;

                        System.out.println("Product deleted successfully");

                    } 
                    else {
                        System.out.println("No product found");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 5 );

        sc.close();
    }
}