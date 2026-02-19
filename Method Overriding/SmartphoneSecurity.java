class Phone {
    // Parent Method: Traditional/Basic security logic
    void unlock() {
        System.out.println("Method unlock (Parent) started");
        
        System.out.println("Unlocking via Slide to Open...");
        
        System.out.println("Method unlock (Parent) ended");
    }
}

class IPhone extends Phone {
    // Overriding: Updating the unlock logic for modern hardware
    @Override
    void unlock() {
        System.out.println("Method unlock (Child) started");
        
        // Specific Logic: FaceID replaces the generic Slide to Open
        System.out.println("Unlocking via FaceID Recognition...");
        
        System.out.println("Method unlock (Child) ended");
    }
}

class SmartphoneSecurity {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Reference and Object are both of the Child type (IPhone)
        IPhone phone = new IPhone();
        
        // JVM executes the overridden version in the IPhone class
        phone.unlock(); 

        System.out.println("Main method ended");
    }
}