import java.util.*;

// Write a program to Create ticket booking system.

public class TicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int totalSeats = 10;
        int bookedSeats = 0;

        do {

            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch ( choice ) {

                case 1:

                    System.out.println("Available Seats : " + (totalSeats - bookedSeats));
                    break;

                case 2:

                    if ( bookedSeats < totalSeats ) {
                        bookedSeats++;
                        System.out.println("Ticket booked successfully");
                    } 
                    else {
                        System.out.println("Sorry! No seats available");
                    }

                    break;

                case 3:

                    if ( bookedSeats > 0 ) {
                        bookedSeats--;
                        System.out.println("Ticket cancelled successfully");
                    } 
                    else {
                        System.out.println("No booked tickets to cancel");
                    }

                    break;

                case 4:

                    System.out.println("Thank you for using the Ticket Booking System");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } 
        while ( choice != 4 );

        sc.close();
    }
}