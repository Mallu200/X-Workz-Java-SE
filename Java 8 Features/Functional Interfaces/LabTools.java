@FunctionalInterface
interface Converter {
    double transform(double value); // Single abstract method for math logic
}

class LabTools {
    public static void main(String[] args) {
        // Lambda to convert Kilometers to Miles
        Converter kmToMiles = (km) -> km * 0.621;

        System.out.println("10 KM in Miles: " + kmToMiles.transform(10)); // Prints 6.21
    }
}