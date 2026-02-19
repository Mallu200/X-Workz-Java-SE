class ATM {
    // Instance variable: Private and unique to the specific card
    String pinCode;

    public static void main(String[] args) {
        System.out.println("Main started");
		
		// Creating ATM instances
        ATM myCard = new ATM();
        
        // Assigning a value to this specific instance
        myCard.pinCode = "4321";

        System.out.println("Card Security Status: PIN is set for this object.");
        // Accessing the instance variable via the object
        System.out.println("Authorized PIN: " + myCard.pinCode);

        System.out.println("Main ended");
    }
}