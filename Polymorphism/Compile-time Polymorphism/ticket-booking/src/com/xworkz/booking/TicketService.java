package com.xworkz.booking;

public class TicketService {

    // 1. Basic Booking (Individual)
    public void book(String passengerName) {
        System.out.println("Booking individual ticket for: " + passengerName);
    }

    // 2. Group Booking (Same name, different number of parameters)
    public void book(String primaryPassenger, int totalMembers) {
        System.out.println("Booking Group Ticket. Primary: " + primaryPassenger + " | Total Passengers: " + totalMembers);
    }

    // 3. Selective Booking (Different types)
    public void book(String passengerName, String travelClass) {
        System.out.println("Booking ticket for " + passengerName + " in " + travelClass + " Class.");
    }

    // 4. Booking via PNR (Different data type - long)
    public void book(long pnrNumber) {
        System.out.println("Re-booking/Confirming ticket via PNR: " + pnrNumber);
    }
}
