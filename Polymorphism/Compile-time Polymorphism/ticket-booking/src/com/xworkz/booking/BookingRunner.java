package com.xworkz.booking;

public class BookingRunner {
    public static void main(String[] args) {
        TicketService service = new TicketService();

        System.out.println("--- Scenario 1: Solo Traveler ---");
        service.book("Abhishek");

        System.out.println("\n--- Scenario 2: Family Trip ---");
        service.book("Suresh", 4);

        System.out.println("\n--- Scenario 3: Luxury Travel ---");
        service.book("Deepa", "Business");

        System.out.println("\n--- Scenario 4: Existing Reservation ---");
        service.book(4251678930L);
    }
}