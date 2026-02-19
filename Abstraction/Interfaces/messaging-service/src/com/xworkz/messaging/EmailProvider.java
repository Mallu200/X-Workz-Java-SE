package com.xworkz.messaging;

public class EmailProvider implements MessageProvider {

    @Override
    public void sendMessage(String recipient, String content) {
        System.out.println("Invoking sendMessage in EmailProvider");
        System.out.println(">> [EMAIL] Sending SMTP request to: " + recipient);
        System.out.println(">> Subject: Notification | Body: " + content);
    }

    @Override
    public void checkDeliveryStatus() {
        System.out.println(">> [EMAIL] Status: Delivered to Inbox.");
    }
}