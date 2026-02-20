package com.xworkz.ticket;

import com.xworkz.ticket.dto.TicketDTO;
import com.xworkz.ticket.enums.Priority;

public class TicketRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Creating a new Ticket DTO using the Enum constant
        TicketDTO supportTicket = new TicketDTO(501, "Server is down", Priority.HIGH);

        // Printing individual values using Getters
        System.out.println("Invoking getTicketId: " + supportTicket.getTicketId());
        System.out.println("Invoking getDescription: " + supportTicket.getDescription());
        System.out.println("Invoking getPriority: " + supportTicket.getPriority());

        // Checking the full DTO data using toString
        System.out.println("Ticket Data: " + supportTicket.toString());

        // Changing the priority using Setter
        supportTicket.setPriority(Priority.LOW);
        System.out.println("Updated Priority: " + supportTicket.getPriority());

        System.out.println("Main method ended.");
    }
}
