class User {
    User() {
        System.out.println("Step 1: User Identity verified (Grandparent)");
    }
}

class Admin extends User {
    String username;

    Admin(String username) {
        // Implicitly calls super() for User
        this.username = username;
        System.out.println("Step 2: Admin Dashboard loaded for: " + username + " (Parent)");
    }
}

class SuperAdmin extends Admin {
    String securityKey;

    SuperAdmin(String username, String key) {
        super(username); // Calls Admin(String)
        this.securityKey = key;
        System.out.println("Step 3: Root access granted with Key: " + key + " (Child)");
    }

    void showPrivileges() {
        System.out.println("Current Access -> User: " + username + " | Security Level: MASTER");
    }

    public static void main(String args[]) {
        System.out.println("--- System Login: Initializing Permissions ---");
        SuperAdmin root = new SuperAdmin("Karan_Dev", "999-SEC-01");
        
        System.out.println("----------------------------------------------");
        root.showPrivileges();
    }
}