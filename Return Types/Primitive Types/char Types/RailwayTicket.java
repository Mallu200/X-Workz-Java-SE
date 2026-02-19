class RailwayTicket {
    // char is ideal for category codes
    static char getCoachClass() {
        // Logic: Returns the class of travel
        return 'S'; // 'S' for Sleeper
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        char type = getCoachClass();
        System.out.println("Coach Category: " + type);
        System.out.println("Main ended");
    }
}