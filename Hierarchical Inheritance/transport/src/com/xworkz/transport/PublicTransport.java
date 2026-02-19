package com.xworkz.transport;

// PublicTransport 'Is-A' Vehicle
public class PublicTransport extends Vehicle {

    public void issueTicket() {
        System.out.println("Invoking issueTicket in PublicTransport"); // Mandatory SOP
        System.out.println(">> [PUBLIC] Ticket generated. Route: Terminal A to Terminal B.");
    }
}