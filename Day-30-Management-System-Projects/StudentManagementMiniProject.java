import java.util.*;

// Write a program to Develop complete mini project using arrays, strings and functions.

public class StudentManagementMiniProject {

    static Scanner sc = new Scanner(System.in);

    static int size;
    static int[] rollNo;
    static String[] name;
    static double[] marks;

    public static void main(String[] args) {

        System.out.print("Enter number of students: ");
        size = sc.nextInt();
        sc.nextLine();

        rollNo = new int[size];
        name = new String[size];
        marks = new double[size];

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student Records");
            System.out.println("2. View Student Records");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudents();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }

    public static void addStudents() {

        sc.nextLine();

        for (int i = 0; i < size; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Roll Number: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("Student records added successfully.");
    }

    public static void viewStudents() {

        System.out.println("\nStudent Records");

        for (int i = 0; i < size; i++) {

            System.out.println("--------------------------");
            System.out.println("Roll Number : " + rollNo[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Marks       : " + marks[i]);
        }
    }

    public static void searchStudent() {

        System.out.print("Enter Roll Number: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (rollNo[i] == key) {

                System.out.println("\nStudent Found");
                System.out.println("Roll Number : " + rollNo[i]);
                System.out.println("Name        : " + name[i]);
                System.out.println("Marks       : " + marks[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void updateMarks() {

        System.out.print("Enter Roll Number: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (rollNo[i] == key) {

                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextDouble();

                System.out.println("Marks updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}