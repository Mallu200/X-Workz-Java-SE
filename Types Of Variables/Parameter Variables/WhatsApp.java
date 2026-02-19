class WhatsApp {
    // Two parameter variables: 'receiver' and 'text'
    public static void sendMessage(String receiver, String text) {
        System.out.println("To: " + receiver);
        System.out.println("Message: " + text);
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        // Passing two arguments to the method
        sendMessage("Abhishek", "Hey, are you coming to X-Workz?");

        System.out.println("Main ended");
    }
}