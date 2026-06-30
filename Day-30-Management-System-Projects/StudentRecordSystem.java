import java.util.*;

// Write a program to Create student record system using arrays and strings.

public class StudentRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int size = sc.nextInt();
        sc.nextLine();

        int[] rollNo = new int[size];
        String[] name = new String[size];
        double[] marks = new double[size];

        int choice;

        do {

            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student Records");
            System.out.println("2. View Student Records");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    sc.nextLine();

                    for ( int i = 0; i < size; i++ ) {

                        System.out.println("\nEnter details of Student " + (i + 1));

                        System.out.print("Roll Number : ");
                        rollNo[i] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name : ");
                        name[i] = sc.nextLine();

                        System.out.print("Marks : ");
                        marks[i] = sc.nextDouble();
                    }

                    System.out.println("Student records added successfully");
                    break;

                case 2:

                    System.out.println("\nStudent Records");

                    for ( int i = 0; i < size; i++ ) {

                        System.out.println("---------------------------");
                        System.out.println("Roll Number : " + rollNo[i]);
                        System.out.println("Name        : " + name[i]);
                        System.out.println("Marks       : " + marks[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Roll Number to search : ");
                    int key = sc.nextInt();

                    boolean found = false;

                    for ( int i = 0; i < size; i++ ) {

                        if ( rollNo[i] == key ) {

                            System.out.println("\nStudent Found");
                            System.out.println("Roll Number : " + rollNo[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Marks       : " + marks[i]);

                            found = true;
                            break;
                        }
                    }

                    if ( !found ) {
                        System.out.println("Student record not found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Roll Number : ");
                    key = sc.nextInt();

                    found = false;

                    for ( int i = 0; i < size; i++ ) {

                        if ( rollNo[i] == key ) {

                            System.out.print("Enter New Marks : ");
                            marks[i] = sc.nextDouble();

                            System.out.println("Marks updated successfully");
                            found = true;
                            break;
                        }
                    }

                    if ( !found ) {
                        System.out.println("Student record not found");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Student Record System...");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 5 );

        sc.close();
    }
}