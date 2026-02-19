class Notifications {
    // Parameter 'users' is an array of non-primitive String objects
    static void notifyFollowers(String[] users) {
        System.out.println("Method notifyFollowers started");
        
        for (String user : users) {
            System.out.println("Sending alert to: @" + user);
        }
        
        System.out.println("All " + users.length + " alerts sent successfully.");
        System.out.println("Method notifyFollowers ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        String[] followerList = {"rahul_99", "priya_v", "karan_code"};
        notifyFollowers(followerList);
        System.out.println("Main ended");
    }
}