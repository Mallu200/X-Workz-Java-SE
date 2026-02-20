package com.xworkz.ticket.dto;

import com.xworkz.ticket.enums.Priority;

import java.util.Objects;

public class TicketDTO {
    // Private properties for Encapsulation
    private int ticketId;
    private String description;
    private Priority priority; // Enum type

    // Default Constructor
    public TicketDTO(){
        // No-arg constructor
    }

    // Parameterized Constructor
    public TicketDTO(int ticketId, String description, Priority priority) {
        this.ticketId = ticketId;
        this.description = description;
        this.priority = priority;
    }

    // Getters and Setters

    public int getTicketId() { return ticketId; }
    public void setTicketId(int ticketId) { this.ticketId = ticketId;}

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Priority getPriority() { return priority; }
    public void setPriority(Priority priority) { this.priority = priority; }

    // Standard Object Methods
    @Override
    public String toString() {
        return "TicketDTO [ticketId=" + ticketId + ", description=" + description + ", priority=" + priority + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketDTO ticketDTO = (TicketDTO) o;
        return ticketId == ticketDTO.ticketId && Objects.equals(description, ticketDTO.description) && priority == ticketDTO.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, description, priority);
    }
}