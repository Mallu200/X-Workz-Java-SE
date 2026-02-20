package com.xworkz.hotel;

import com.xworkz.hotel.dto.HotelBookingDTO;
import com.xworkz.hotel.enums.RoomType;

public class BookingRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Using the Builder Pattern instead of a traditional constructor
        // This is highly readable and "clean"
        HotelBookingDTO booking = HotelBookingDTO.builder()
                .guestName("Rahul")
                .numberOfDays(3)
                .room(RoomType.SUITE)
                .totalPrice(15000.0)
                .isPaid(true)
                .build();

        // Accessing data using Lombok Getters
        System.out.println("Invoking getGuestName: " + booking.getGuestName());
        System.out.println("Invoking getRoom: " + booking.getRoom());

        // Printing the full state via @Data's toString
        System.out.println("Current Booking: " + booking.toString());

        //  Modifying data using Lombok's generated Setter
        booking.setPaid(false);
        System.out.println("Updated Payment Status: " + booking.isPaid());

        System.out.println("Main method ended.");
    }
}