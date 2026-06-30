import java.util.*;

// Write a program to Create employee management system.

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int employeeId = 0;
        String employeeName = "";
        double salary = 0;
        boolean recordExists = false;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter Employee ID : ");
                    employeeId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    employeeName = sc.nextLine();

                    System.out.print("Enter Salary : ");
                    salary = sc.nextDouble();

                    recordExists = true;

                    System.out.println("Employee record added successfully");
                    break;

                case 2:

                    if ( recordExists ) {
                        System.out.println("\nEmployee Details");
                        System.out.println("Employee ID : " + employeeId);
                        System.out.println("Employee Name : " + employeeName);
                        System.out.println("Salary : " + salary);
                    } 
                    else {
                        System.out.println("No employee record found");
                    }

                    break;

                case 3:

                    if ( recordExists ) {
                        System.out.print("Enter New Salary : ");
                        salary = sc.nextDouble();
                        System.out.println("Salary updated successfully");
                    } 
                    else {
                        System.out.println("No employee record found");
                    }

                    break;

                case 4:

                    if ( recordExists ) {
                        recordExists = false;
                        System.out.println("Employee record deleted successfully");
                    } 
                    else {
                        System.out.println("No employee record found");
                    }

                    break;

                case 5:
                    System.out.println("Exiting Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
         while ( choice != 5 );

        sc.close();
    }
}