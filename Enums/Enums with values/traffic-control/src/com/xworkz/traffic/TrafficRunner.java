package com.xworkz.traffic;

import com.xworkz.traffic.dto.TrafficSignalDTO;
import com.xworkz.traffic.enums.SignalColor;

public class TrafficRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Creating the DTO for a specific signal post
        TrafficSignalDTO signal = new TrafficSignalDTO("Silk Board Junction", SignalColor.RED);

        // Accessing information via DTO and Enum
        System.out.println("Invoking getSignalLocation: " + signal.getSignalLocation());
        System.out.println("Invoking getActiveColor: " + signal.getActiveColor());

        // Fetching associated data from the Enum constant
        int seconds = signal.getActiveColor().getDuration();
        String currentAction = signal.getActiveColor().getAction();

        System.out.println("Required Action: " + currentAction);
        System.out.println("Please wait for: " + seconds + " seconds.");

        // Changing status to simulate time passing
        signal.setActiveColor(SignalColor.GREEN);
        System.out.println("Signal changed to: " + signal.getActiveColor());
        System.out.println("New Action: " + signal.getActiveColor().getAction());

        System.out.println("Main method ended.");
    }
}