package com.xworkz.construction;

public class ConstructionRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in ConstructionRunner"); // Execution start log

        // Instantiate the most specific Child class
        Apartment myHome = new Apartment();

        System.out.println("Project: Construction Multilevel Inheritance");
        System.out.println("-------------------------------------------");

        // 1. Calling Grandparent behavior (Foundation)
        myHome.layFoundation();

        // 2. Calling Parent behavior (Utilities)
        myHome.connectUtilities();

        // 3. Calling Child behavior (Specific Unit)
        myHome.balconyView();

        // 4. Accessing attributes across levels
        System.out.println("Structure Foundation: " + myHome.foundationType); // From Grandparent
        System.out.println("Unit Location: Floor " + myHome.floorNumber);     // From Child

        System.out.println("Main method ended successfully"); // Execution end log
    }
}