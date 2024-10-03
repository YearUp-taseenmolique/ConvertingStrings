package com.pluralsight;
import java.util.*;

public class TheaterReservations {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){


        System.out.println("Enter name: ");
        String fullName = s.nextLine().trim();


        System.out.println("Enter date (MM/DD/YYYY): ");
        String date = s.nextLine().trim();


        System.out.print("How many tickets: ");
        int tickets = s.nextInt();


        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        String ticketWord = tickets == 1 ? "Ticket" : "Tickets";

        System.out.printf("%d %s reserved for %s under %s, %s%n",
                tickets, ticketWord, date, lastName, firstName);





    }

}
