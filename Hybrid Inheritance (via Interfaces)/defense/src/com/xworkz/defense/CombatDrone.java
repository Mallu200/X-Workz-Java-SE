package com.xworkz.defense;

// CombatDrone 'Is-A' Drone (Multilevel)
// AND implements RemoteControl, CameraSystem (Multiple)
public class CombatDrone extends Drone implements RemoteControl, CameraSystem {

    @Override
    public void receiveSignal() {
        System.out.println("Invoking receiveSignal in CombatDrone"); // Mandatory SOP
        System.out.println(">> [COMMS] Encrypted satellite link established.");
    }

    @Override
    public void streamVideo() {
        System.out.println("Invoking streamVideo in CombatDrone"); // Mandatory SOP
        System.out.println(">> [OPTICS] Streaming 4K thermal imaging feed to base.");
    }
}