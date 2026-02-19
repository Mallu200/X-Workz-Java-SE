package com.xworkz.messaging;

// The 'extends' keyword establishes the 'Is-A' relationship
public class WhatsApp extends MessagingApp {

    // Unique method for child: Standard messaging apps don't all have voice notes
    public void sendVoiceNote() {
        System.out.println("Invoking sendVoiceNote in WhatsApp"); // Tracking method entry
        System.out.println(">> [WHATSAPP] Recording and sending voice note...");
    }

    // Unique method for child: Specific to advanced messengers
    public void videoCall() {
        System.out.println("Invoking videoCall in WhatsApp"); // Tracking method entry
        System.out.println(">> [WHATSAPP] Starting high-definition video call...");
    }
}