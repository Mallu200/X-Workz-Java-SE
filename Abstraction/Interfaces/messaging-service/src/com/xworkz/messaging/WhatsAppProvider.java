package com.xworkz.messaging;

public class WhatsAppProvider implements MessageProvider {

    @Override
    public void sendMessage(String recipient, String content) {
        System.out.println("Invoking sendMessage in WhatsAppProvider");
        System.out.println(">> [WHATSAPP] Sending encrypted message to: " + recipient);
        System.out.println(">> Content: " + content);
    }

    @Override
    public void checkDeliveryStatus() {
        System.out.println(">> [WHATSAPP] Status: Blue Ticks (Read)");
    }
}
