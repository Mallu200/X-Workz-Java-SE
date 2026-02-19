class Vehicle {
    // The Parent method: General logic for all vehicles
    void checkFuel() {
        System.out.println("Method checkFuel (Parent) started");
        
        System.out.println("Calculating Petrol/Diesel consumption...");
        
        System.out.println("Method checkFuel (Parent) ended");
    }
}

class EV extends Vehicle {
    // @Override is an annotation that tells the compiler we are redefining a parent method
    @Override
    void checkFuel() {
        System.out.println("Method checkFuel (Child) started");
        
        // Specific logic: EVs don't use petrol, so we change the behavior
        System.out.println("Calculating Battery Percentage and Range...");
        
        System.out.println("Method checkFuel (Child) ended");
    }
}

class Transportation {
    public static void main(String[] args) {
        System.out.println("Main method started");
        
        // Creating the Child object
        EV myCar = new EV();
        
        // Logic: Since the object is of type EV, it runs the Overridden version
        myCar.checkFuel(); 
        
        System.out.println("Main method ended");
    }
}