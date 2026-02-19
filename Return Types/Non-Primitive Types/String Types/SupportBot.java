class SupportBot {
    // String is a non-primitive used for text sentences
    static String getWelcomeMessage() {
        // Logic: Returns a friendly greeting
        return "Hello! How can I help you today?"; 
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        String message = getWelcomeMessage();
        System.out.println("Bot says: " + message);
        System.out.println("Main ended");
    }
}