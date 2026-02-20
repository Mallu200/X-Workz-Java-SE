class DeliveryLogistics {
    public static void main(String[] args) {
        int totalPackages = 105;
        int truckCapacity = 10;

        int trucksFull = totalPackages / truckCapacity;
        int leftOver = totalPackages % truckCapacity;

        System.out.println("Full Trucks: " + trucksFull); // 10
        System.out.println("Packages left for bike: " + leftOver); // 5
    }
}