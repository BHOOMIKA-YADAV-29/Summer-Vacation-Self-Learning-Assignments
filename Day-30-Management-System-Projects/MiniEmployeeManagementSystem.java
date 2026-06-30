import java.util.*;

public class MiniEmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int size = sc.nextInt();
        sc.nextLine();

        int[] employeeId = new int[size];
        String[] employeeName = new String[size];
        double[] salary = new double[size];

        int choice;

        do {

            System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    for (int i = 0; i < size; i++) {

                        System.out.println("\nEnter details of Employee " + (i + 1));

                        System.out.print("Employee ID: ");
                        employeeId[i] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Employee Name: ");
                        employeeName[i] = sc.nextLine();

                        System.out.print("Salary: ");
                        salary[i] = sc.nextDouble();
                    }

                    System.out.println("Employee records added successfully.");
                    break;

                case 2:

                    System.out.println("\nEmployee Records");

                    for (int i = 0; i < size; i++) {

                        System.out.println("----------------------------");
                        System.out.println("Employee ID   : " + employeeId[i]);
                        System.out.println("Employee Name : " + employeeName[i]);
                        System.out.println("Salary        : " + salary[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID to search: ");
                    int id = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < size; i++) {

                        if (employeeId[i] == id) {

                            System.out.println("\nEmployee Found");
                            System.out.println("Employee ID   : " + employeeId[i]);
                            System.out.println("Employee Name : " + employeeName[i]);
                            System.out.println("Salary        : " + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();

                    found = false;

                    for (int i = 0; i < size; i++) {

                        if (employeeId[i] == id) {

                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();

                            System.out.println("Salary updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Mini Employee Management System...");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}