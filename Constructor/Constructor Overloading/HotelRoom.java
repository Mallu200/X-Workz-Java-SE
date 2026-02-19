class HotelRoom {
    String guestName;
    String type;
	
    // Version 1: Basic booking (1 Parameter)
    // Logic: If no room type is mentioned, we default to "Standard"
    HotelRoom(String name) {
        System.out.println("Constructor 1 (Guest only) started");
        this.guestName = name;
        this.type = "Standard";
    }
	
    // Version 2: Custom booking (2 Parameters)
    // Logic: Allows specific assignment of room type (Suite, Deluxe, etc.)
    HotelRoom(String name, String type) {
        System.out.println("Constructor 2 (Guest + Type) started");
        this.guestName = name;
        this.type = type;
    }
	
    void show() {
        System.out.println(guestName + " booked a " + type + " room.");
    }
	
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Uses Constructor 1
        HotelRoom h1 = new HotelRoom("Ajith");
        
        // Uses Constructor 2
        HotelRoom h2 = new HotelRoom("Priya", "Suite");
        
        h1.show();
        h2.show();

        System.out.println("Main method ended");
    }
}