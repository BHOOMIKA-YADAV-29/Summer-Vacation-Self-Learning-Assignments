import java.util.*;

// Write a program to Create student record management system.

public class StudentRecordManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int rollNo = 0;
        String name = "";
        float marks = 0;
        boolean recordExists = false;

        do {

            System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student Record");
            System.out.println("2. View Student Record");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student Record");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter Roll Number : ");
                    rollNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Marks : ");
                    marks = sc.nextFloat();

                    recordExists = true;

                    System.out.println("Student record added successfully");
                    break;

                case 2:

                    if ( recordExists ) {
                        System.out.println("\nStudent Details");
                        System.out.println("Roll Number : " + rollNo);
                        System.out.println("Name : " + name);
                        System.out.println("Marks : " + marks);
                    } 
                    else {
                        System.out.println("No student record found");
                    }

                    break;

                case 3:

                    if ( recordExists ) {
                        System.out.print("Enter new marks : ");
                        marks = sc.nextFloat();
                        System.out.println("Marks updated successfully");
                    } 
                    else {
                        System.out.println("No student record found");
                    }

                    break;

                case 4:

                    if ( recordExists ) {
                        recordExists = false;
                        System.out.println("Student record deleted successfully");
                    } 
                    else {
                        System.out.println("No student record found");
                    }

                    break;

                case 5:
                    System.out.println("Exiting Student Record Management System...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
} 