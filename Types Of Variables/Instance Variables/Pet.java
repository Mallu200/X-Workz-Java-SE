class Pet {
    // Instance variable: Every pet object can be a different breed
    String breed;

    public static void main(String[] args) {
        System.out.println("Main started");
		
		// Creating Pet instances
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
		
		// Assigning breed instances
        pet1.breed = "Golden Retriever";
        pet2.breed = "Persian Cat";

		// Accessing the instance variable via the object
        System.out.println("Pet 1 is a: " + pet1.breed);
        System.out.println("Pet 2 is a: " + pet2.breed);

        System.out.println("Main ended");
    }
}