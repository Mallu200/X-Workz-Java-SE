class BloodDonor {
    // char efficiently stores basic blood group letters
    static char getBloodGroup() {
        // Logic: Returns the primary blood category
        return 'O';
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        char group = getBloodGroup();
        System.out.println("Donor Blood Group: " + group);
        System.out.println("Main ended");
    }
}