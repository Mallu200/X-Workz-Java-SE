class Employee {
    String name;
    int id;

    // Version 1: Partial Data (1 Parameter)
    // Logic: Used for candidates or new hires whose ID is still being processed
    Employee(String name) {
        System.out.println("Constructor 1 (Name only) started");
        this.name = name;
        this.id = 0; // "0" acts as a placeholder for 'Not Assigned'
    }

    // Version 2: Full Data (2 Parameters)
    // Logic: Used when the ID is already known at the time of creation
    Employee(String name, int id) {
        System.out.println("Constructor 2 (Name + ID) started");
        this.name = name;
        this.id = id;
    }
	
    void onboarding() {
        if (id == 0) {
            System.out.println("Status: Pending ID | Name: " + name);
        } else {
            System.out.println("Status: Fully Onboarded | ID: " + id + " | Name: " + name);
        }
    }
	
    public static void main(String args[]) {
        System.out.println("Main method started");

        // Object 1: New hire without ID
        Employee e1 = new Employee("Karan");
        
        // Object 2: Established hire with ID
        Employee e2 = new Employee("Sonia", 501);
        
        e1.onboarding();
        e2.onboarding();

        System.out.println("Main method ended");
    }
}