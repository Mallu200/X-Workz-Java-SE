class Employee {
    String name;
    int id;

    // --- STEP 1: INDEPENDENT INSTANTIATION ---
    // Employees are created as individual entities.
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println(">> [HR-SYSTEM] New Hire: " + name + " (ID: " + id + ") created in database.");
    }
}

class Manager {
    String managerName;
    
    // --- STEP 2: THE ONE-TO-MANY LINK ---
    // An Array of Employee objects. One Manager 'has-many' Employees.
    Employee[] team; 

    // Constructor: Injecting the entire team (Array) into the Manager
    Manager(String name, Employee[] team) {
        this.managerName = name;
        
        // The association happens here: The manager's 'team' reference 
        // now points to the array of employees created in main.
        this.team = team; 
        System.out.println(">> [ORG-STRUCTURE] Manager " + name + " appointed to lead " + team.length + " staff members.");
    }

    void showTeamDetails() {
        System.out.println("\n--- [CORPORATE TEAM ROSTER] ---");
        System.out.println("Manager In-Charge: " + this.managerName);
        
        // Logic Check: Ensure the team array is not null
        if (team != null && team.length > 0) {
            // TRAVERSING THE ASSOCIATION:
            // Since it's 'Many', we must use a loop to visit each associated object.
            for (Employee emp : team) {
                System.out.println("  > Employee ID: " + emp.id + " | Name: " + emp.name);
            }
        } else {
            System.out.println("  > Alert: This manager has no assigned team members.");
        }
        System.out.println("--------------------------------\n");
    }
}

class OneToManyCorp {
    public static void main(String[] args) {
        System.out.println(">> [LOG] Initializing Corporate Hierarchy...");

        // 1. Create the 'Many' (Individual Employees)
        Employee e1 = new Employee("Amit", 101);
        Employee e2 = new Employee("Suman", 102);
        Employee e3 = new Employee("Raj", 103);

        // 2. Group them into a Collection (Array)
        // This array holds the memory addresses of e1, e2, and e3.
        Employee[] myTeam = {e1, e2, e3};

        // 3. Create the 'One' (Manager) and link the 'Many' (Team)
        Manager m = new Manager("Vikram Singh", myTeam);

        // 4. Access the 'Many' through the 'One'
        m.showTeamDetails();

        System.out.println(">> [LOG] Hierarchy Report Generated.");
    }
}