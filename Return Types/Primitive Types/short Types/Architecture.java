class Architecture {
    // short handles floor counts of skyscrapers with ease
    static short getFloorCount() {
        // Logic: Returns the number of floors in a building
        return 163; // Burj Khalifa has 163 floors
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        short floors = getFloorCount();
        System.out.println("Building Height: " + floors + " floors");
        System.out.println("Main ended");
    }
}