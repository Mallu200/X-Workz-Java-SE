class Vehicle {
    void wash() {
		System.out.println("Vehicle washed."); }
}
class Car extends Vehicle {
    void checkAirbags() { 
		System.out.println("Airbags safety check complete."); }
}

class ServiceCenter {
    public static void main(String[] args) {
        Vehicle v = new Car(); // Upcasting
        
        // Downcasting to use Car-only features
        Car myCar = (Car) v;
        myCar.checkAirbags();
    }
}