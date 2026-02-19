class Profile {
    String username = "Zayan_Code";
    int followers = 5000;
    boolean isVerified = true;
}

class Instagram {
    // Returns a custom Object of type 'Profile'
    static Profile getUserData() {
        return new Profile(); // Logic: Creates a new package of data
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Profile user = getUserData();
        System.out.println("User: " + user.username + " | Verified: " + user.isVerified);
        System.out.println("Main ended");
    }
}