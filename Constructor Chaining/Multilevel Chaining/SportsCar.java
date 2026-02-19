class Vehicle {
    Vehicle() {
        System.out.println("Step 1: Chassis and basic safety systems ready (Grandparent)");
    }
}

class Car extends Vehicle {
    String brand;

    Car(String brand) {
        // Implicitly calls super() for Vehicle
        this.brand = brand;
        System.out.println("Step 2: Car brand set to: " + brand + " (Parent)");
    }
}

class SportsCar extends Car {
    int topSpeed;

    SportsCar(String brand, int topSpeed) {
        super(brand); // Calls Car(String) constructor
        this.topSpeed = topSpeed;
        System.out.println("Step 3: Turbo engine tuned to " + topSpeed + " km/h (Child)");
    }

    void drive() {
        System.out.println(brand + " SportsCar is zooming at " + topSpeed + " km/h!");
    }

    public static void main(String args[]) {
        System.out.println("--- Factory: Manufacturing SportsCar ---");
        SportsCar fastCar = new SportsCar("Ferrari", 350);
        
        System.out.println("---------------------------------------");
        fastCar.drive();
    }
}