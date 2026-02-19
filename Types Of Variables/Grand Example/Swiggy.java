class Swiggy {
    // 1. STATIC: Shared across all deliveries
    static String company = "Swiggy";

    // 2. INSTANCE: Every user has a different address
    String deliveryAddress;

    // 3. PARAMETER: 'item' is what the customer ordered
    public void deliver(String item) {
        // 4. LOCAL: Time is calculated only for this specific trip
        int timeInMins = 30;

        System.out.println("Company: " + company);
        System.out.println("Delivering " + item + " to " + deliveryAddress);
        System.out.println("Estimated Time: " + timeInMins + " minutes");
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        Swiggy d1 = new Swiggy();
        d1.deliveryAddress = "Rajajinagar, Bangalore";
        d1.deliver("Pizza");

        System.out.println("Main ended");
    }
}