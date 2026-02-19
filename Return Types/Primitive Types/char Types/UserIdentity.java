class UserIdentity {
    // char is used for standardized single-letter initials
    static char getGenderInitial() {
        // Logic: Returns 'M' for Male, 'F' for Female
        return 'M';
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        char gender = getGenderInitial();
        System.out.println("Gender Initial: " + gender);
        System.out.println("Main ended");
    }
}