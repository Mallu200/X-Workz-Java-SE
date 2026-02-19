class SmartHub {
    // Varargs allows for a list of room names
    static void turnOnLights(String... rooms) {
        System.out.println("Method turnOnLights started");
        
        if (rooms.length == 0) {
            System.out.println("No rooms specified. Keeping lights off.");
        } else {
            for (String room : rooms) {
                System.out.println("Lights ON in: " + room);
            }
        }
        
        System.out.println("Method turnOnLights ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing 2 arguments
        turnOnLights("Kitchen", "Bedroom");
        
        System.out.println("Main ended");
    }
}