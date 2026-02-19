class UserProfile {
    // byte handles ages (0-127) perfectly
    static byte getMemberAge() {
        // Logic: Returns the user's age from the database
        return 28;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        byte age = getMemberAge();
        System.out.println("Verified Age: " + age);
        System.out.println("Main ended");
    }
}