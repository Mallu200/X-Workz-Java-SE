package com.xworkz.defense;

public class DefenseRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in DefenseRunner");

        CombatDrone predatorX = new CombatDrone();

        System.out.println("Project: Defense Hybrid Inheritance");
        System.out.println("----------------------------------");

        // 1. From Grandparent (Multilevel)
        predatorX.takeoff();

        // 2. From Parent (Multilevel)
        predatorX.hover();

        // 3. From RemoteControl Interface (Multiple)
        predatorX.receiveSignal();

        // 4. From CameraSystem Interface (Multiple)
        predatorX.streamVideo();

        System.out.println("Main method ended successfully");
    }
}