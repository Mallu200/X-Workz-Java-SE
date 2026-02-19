class SmartBulb {
    // INSTANCE VARIABLE: Every bulb has its own unique 'isOn' memory slot
    boolean isOn = false;
    
    // INSTANCE METHOD: No 'static' keyword here!
    // This method acts on the specific object that calls it.
    void toggle() {
        // '!' flips the boolean (true becomes false, false becomes true)
        isOn = !isOn;
        
        // Using a Ternary Operator (condition ? trueValue : falseValue)
        System.out.println("Light is now " + (isOn ? "ON" : "OFF"));
    }
    
    public static void main(String[] args) {
        System.out.println("Main started");

        // CREATING OBJECTS (Instances)
        // kitchenLight and bedroomLight are separate "copies" of the class
        SmartBulb kitchenLight = new SmartBulb(); 
        SmartBulb bedroomLight = new SmartBulb(); 
        
        // ACTION: Calling the instance method
        System.out.print("Kitchen: ");
        kitchenLight.toggle(); // kitchenLight.isOn becomes true
        
        System.out.print("Bedroom: ");
        // bedroomLight.isOn is still false! We haven't touched it.
        System.out.println("Bedroom is still " + (bedroomLight.isOn ? "ON" : "OFF"));

        System.out.println("Main ended");
    }
}