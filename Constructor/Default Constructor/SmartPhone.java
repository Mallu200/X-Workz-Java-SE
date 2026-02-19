class SmartPhone {
    int volume;
    int brightness;
    boolean isBluetoothOn;
    
    // Default Constructor: No parameters
    // Its job is to set the "Factory state" for every new object
    SmartPhone() {
        System.out.println("Constructor SmartPhone() started");
        
        // Initializing variables with default startup values
        volume = 50;
        brightness = 70;
        isBluetoothOn = false;
        
        System.out.println("Phone Initialized with Factory Settings.");
        System.out.println("Constructor SmartPhone() ended");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method started");
        
        // The constructor is called AUTOMATICALLY here
        SmartPhone myPhone = new SmartPhone();
        
        // Checking if the values were actually set
        System.out.println("Current Volume: " + myPhone.volume);
        
        System.out.println("Main method ended");
    }
}