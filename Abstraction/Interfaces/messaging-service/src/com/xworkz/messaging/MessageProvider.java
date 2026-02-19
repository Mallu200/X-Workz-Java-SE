package com.xworkz.messaging;

public interface MessageProvider {
    // Contract methods
    void sendMessage(String recipient, String content);
    void checkDeliveryStatus();
}