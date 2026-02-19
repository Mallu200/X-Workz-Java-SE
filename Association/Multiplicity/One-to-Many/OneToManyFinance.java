class Customer {
    String name;
    long accNum;

    // --- STEP 1: CONSTRUCTOR ---
    // Represents the registration of a new person in the bank's core database.
    Customer(String name, long acc) {
        this.name = name;
        this.accNum = acc;
        // Mandatory SOP to trace individual object creation in the Heap memory
        System.out.println(">> [CORE-BANKING] New Customer Record: " + name + " | Assigned ACC: " + acc);
    }
}

class Bank {
    String branchName;
    
    // --- STEP 2: THE ONE-TO-MANY LINK ---
    // The Bank class 'has-a' reference to an array of Customers.
    // One Bank instance points to multiple Customer objects.
    Customer[] accounts;

    // Constructor: Injecting the Customer array to establish the Association
    Bank(String branch, Customer[] users) {
        this.branchName = branch;
        
        // The association is finalized by linking the local 'accounts' pointer 
        // to the array created in the main execution.
        this.accounts = users;
        System.out.println(">> [BRANCH-MANAGER] " + branch + " initialized with " + users.length + " active accounts.");
    }

    void printCustomerList() {
        System.out.println("\n--- [SECURE ACCOUNT REPOSITORY: " + branchName.toUpperCase() + "] ---");
        
        // Safety Check: Ensure the bank actually has associated accounts
        if (accounts != null && accounts.length > 0) {
            // TRAVERSING THE MANY-SIDE:
            // Using a loop to visit each Customer object and retrieve their data
            for (Customer c : accounts) {
                System.out.println(" >> Account Holder: " + c.name + "\t | Acc Number: " + c.accNum);
            }
        } else {
            System.out.println(" >> Alert: No customer records found for this branch.");
        }
        System.out.println("--------------------------------------------------\n");
    }
}

class OneToManyFinance {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Accessing Financial Database...");

        // 1. Create the 'Many' (Customers) as independent objects
        Customer c1 = new Customer("Rahul", 9988776655L);
        Customer c2 = new Customer("Priya", 1122334455L);

        // 2. Store the customer references in an Array
        Customer[] branchUsers = {c1, c2};

        // 3. Create the 'One' (Bank) and link the 'Many' (Customers)
        Bank sbi = new Bank("SBI Mumbai Main", branchUsers);

        // 4. Access the data through the association
        sbi.printCustomerList();

        System.out.println(">> [SYSTEM] Audit Complete. Closing Database.");
    }
}