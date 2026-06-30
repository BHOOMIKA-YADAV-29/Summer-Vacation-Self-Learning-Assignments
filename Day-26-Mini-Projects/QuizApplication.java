import java.util.*;

// Write a program to Create quiz application.

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        char answer;

        System.out.println("===== JAVA QUIZ =====");

        // Question 1
        System.out.println("\n1. Which keyword is used to create an object?");
        System.out.println("A. class");
        System.out.println("B. new");
        System.out.println("C. public");
        System.out.println("D. static");
        System.out.print("Enter your answer : ");
        answer = Character.toUpperCase(sc.next().charAt(0));

        if ( answer == 'B' ) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("A. start()");
        System.out.println("B. run()");
        System.out.println("C. main()");
        System.out.println("D. init()");
        System.out.print("Enter your answer : ");
        answer = Character.toUpperCase(sc.next().charAt(0));

        if ( answer == 'C' ) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which symbol is used to end a statement in Java?");
        System.out.println("A :");
        System.out.println("B .");
        System.out.println("C ;");
        System.out.println("D ,");
        System.out.print("Enter your answer : ");
        answer = Character.toUpperCase(sc.next().charAt(0));

        if ( answer == 'C' ) {
            score++;
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score : " + score + " out of 3");

        if ( score == 3 ) {
            System.out.println("Excellent!");
        } 
        else if ( score == 2 ) {
            System.out.println("Good Job!");
        } 
        else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}