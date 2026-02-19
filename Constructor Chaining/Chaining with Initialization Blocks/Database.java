class Database {
    String dbName;
    boolean isSecure;

    // Instance Initialization Block
    // Ensures a security handshake happens for EVERY object
    {
        this.isSecure = true;
        System.out.println("[SECURITY] Performing SSL Handshake...");
        System.out.println("[SECURITY] Connection encrypted.");
    }

    // Constructor 1: Standard connection
    Database(String dbName) {
        this.dbName = dbName;
        System.out.println("Constructor: Database '" + dbName + "' initialized.");
    }

    // Constructor 2: Default connection (Chains to Constructor 1)
    Database() {
        this("LocalHost_DB");
        System.out.println("Constructor: Defaulting to local environment.");
    }

    void status() {
        System.out.println("Status -> DB: " + dbName + " | Secure: " + isSecure);
    }

    public static void main(String args[]) {
        System.out.println("Attempting Connection A...");
        Database db1 = new Database("Cloud_Production");
        db1.status();

        System.out.println("\nAttempting Connection B...");
        Database db2 = new Database();
        db2.status();
    }
}