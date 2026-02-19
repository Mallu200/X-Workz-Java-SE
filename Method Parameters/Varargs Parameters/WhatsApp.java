class WhatsApp {
    // String... contacts is the Varargs parameter
    static void sendBroadcast(String... contacts) {
        System.out.println("Method sendBroadcast started");
        
        System.out.println("Sending broadcast to " + contacts.length + " people.");
        for (String name : contacts) {
            System.out.println("Sent to: " + name);
        }
        
        System.out.println("Method sendBroadcast ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing 3 arguments directly
        sendBroadcast("Mom", "Dad", "Brother"); 
        
        System.out.println("Main ended");
    }
}