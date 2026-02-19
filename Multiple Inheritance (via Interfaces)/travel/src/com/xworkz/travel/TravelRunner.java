package com.xworkz.travel;

public class TravelRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in TravelRunner");

        CruiseShip titanic2 = new CruiseShip();

        System.out.println("Project: Cruise Ship Multiple Inheritance");
        System.out.println("----------------------------------------");

        // 1. Using MarineVessel capability
        titanic2.navigateOcean();

        // 2. Using LuxuryHotel capability
        titanic2.provideRoomService();

        System.out.println("Main method ended successfully");
    }
}