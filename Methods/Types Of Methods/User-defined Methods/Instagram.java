class Instagram {
    // USER-DEFINED METHOD: notifyUser
    // 'void' means this method returns NOTHING. It just performs an action.
    // It takes TWO inputs (username and action).
    static void notifyUser(String username, String action) {
        // This is the "Template" for the notification
        System.out.println("Alert: " + username + " just " + action + " your post!");
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // CALLING the method: We pass the data in the exact order defined above
        // Amit -> username, liked -> action
        notifyUser("Amit", "liked");
        
        // We can call it again with totally different data
        notifyUser("Priya", "commented on");
        
        // Another example:
        notifyUser("Rahul", "shared");

        System.out.println("Main ended");
    }
}