package com.xworkz.messaging;

public class MessagingRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        MessageProvider provider;

        // Sending via WhatsApp
        provider = new WhatsAppProvider();
        provider.sendMessage("+91-9886012345", "Hey! Your order is ready.");
        provider.checkDeliveryStatus();

        System.out.println("---------------------------");

        // Sending via Email
        provider = new EmailProvider();
        provider.sendMessage("user@example.com", "Your monthly statement is attached.");
        provider.checkDeliveryStatus();

        System.out.println("Main method ended.");
    }
}
