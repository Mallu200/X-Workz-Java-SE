class Mobile {
    // Instance variable: Each phone has its own model
    String modelName;

    public static void main(String[] args) {
        System.out.println("Main started");

        // Creating two different phone objects
        Mobile phone1 = new Mobile();
        Mobile phone2 = new Mobile();

        // Assigning different data to each object
        phone1.modelName = "iPhone 15";
        phone2.modelName = "Samsung S24";

        System.out.println("Phone 1 Model: " + phone1.modelName);
        System.out.println("Phone 2 Model: " + phone2.modelName);

        System.out.println("Main ended");
    }
}