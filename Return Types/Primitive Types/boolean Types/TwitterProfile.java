class TwitterProfile {
    // boolean handles status verification
    static boolean isVerifiedUser() {
        // Logic: Returns true if the user has a blue checkmark
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        boolean verified = isVerifiedUser();
        System.out.println("Display Blue Tick: " + verified);
        System.out.println("Main ended");
    }
}