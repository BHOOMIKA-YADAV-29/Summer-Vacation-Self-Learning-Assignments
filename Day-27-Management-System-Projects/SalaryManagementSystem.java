import java.util.*;

// Write a program to Create salary management system.

public class SalaryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int employeeId = 0;
        String employeeName = "";
        double basicSalary = 0;
        boolean recordExists = false;

        do {

            System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Salary Details");
            System.out.println("3. Update Basic Salary");
            System.out.println("4. Delete Employee Record");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter Employee ID : ");
                    employeeId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    employeeName = sc.nextLine();

                    System.out.print("Enter Basic Salary : ");
                    basicSalary = sc.nextDouble();

                    recordExists = true;

                    System.out.println("Employee record added successfully");
                    break;

                case 2:

                    if ( recordExists ) {

                        double hra = basicSalary * 0.20;
                        double da = basicSalary * 0.10;
                        double totalSalary = basicSalary + hra + da;

                        System.out.println("\nSalary Details");
                        System.out.println("Employee ID : " + employeeId);
                        System.out.println("Employee Name : " + employeeName);
                        System.out.println("Basic Salary : " + basicSalary);
                        System.out.println("HRA : " + hra);
                        System.out.println("DA : " + da);
                        System.out.println("Total Salary : " + totalSalary);

                    } 
                    else {
                        System.out.println("No employee record found");
                    }

                    break;

                case 3:

                    if ( recordExists ) {
                        System.out.print("Enter New Basic Salary : ");
                        basicSalary = sc.nextDouble();
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
                    System.out.println("Exiting Salary Management System...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
         while ( choice != 5 );

        sc.close();
    }
}