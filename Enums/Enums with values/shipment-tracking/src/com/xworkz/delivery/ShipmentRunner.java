package com.xworkz.delivery;

import com.xworkz.delivery.dto.ShipmentDTO;
import com.xworkz.delivery.enums.Status;

public class ShipmentRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Creating a Shipment DTO
        ShipmentDTO myPackage = new ShipmentDTO("IND-9988", Status.SHIPPED);

        // Accessing the Enum name and its custom value
        System.out.println("Invoking getTrackingId: " + myPackage.getTrackingId());
        System.out.println("Invoking getStatus: " + myPackage.getStatus());

        // Fetching the specific value stored inside the Enum
        int waitTime = myPackage.getStatus().getDaysToWait();
        System.out.println("Estimated days to wait: " + waitTime);

        // Printing the DTO state
        System.out.println("Current Shipment State: " + myPackage.toString());

        System.out.println("Main method ended.");
    }
}