package com.xworkz.hotel.dto;

import com.xworkz.hotel.enums.RoomType;
import lombok.Builder;
import lombok.Data;

@Data      // Provides Getters, Setters, toString, etc.
@Builder   // Provides the "Builder Design Pattern"
public class HotelBookingDTO {
    private String guestName;
    private int numberOfDays;
    private RoomType room;
    private double totalPrice;
    private boolean isPaid;
}