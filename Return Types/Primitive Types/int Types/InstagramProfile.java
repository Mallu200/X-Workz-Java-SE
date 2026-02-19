class InstagramProfile {
    // int handles millions of followers easily
    static int getFollowerCount() {
        // Logic: Returns the number of followers
        return 1500000; // 1.5 Million
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        int followers = getFollowerCount();
        System.out.println("Total Followers: " + followers);
        System.out.println("Main ended");
    }
}