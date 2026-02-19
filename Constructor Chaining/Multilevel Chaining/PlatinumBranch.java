class CentralBank {
    CentralBank() {
        System.out.println("Step 1: Central Bank regulatory standards applied (Grandparent)");
    }
}

class LocalBranch extends CentralBank {
    String branchName;

    LocalBranch(String branchName) {
        // Implicitly calls super() for CentralBank
        this.branchName = branchName;
        System.out.println("Step 2: Local Branch '" + branchName + "' opened (Parent)");
    }
}

class PlatinumBranch extends LocalBranch {
    int vipLoungeCount;

    PlatinumBranch(String branchName, int vipLoungeCount) {
        super(branchName); // Calls LocalBranch(String)
        this.vipLoungeCount = vipLoungeCount;
        System.out.println("Step 3: Platinum services enabled with " + vipLoungeCount + " VIP lounges (Child)");
    }

    void showDetails() {
        System.out.println("Audit Report -> Location: " + branchName + " | Grade: Platinum");
    }

    public static void main(String args[]) {
        System.out.println("--- Banking System: Launching Premium Branch ---");
        PlatinumBranch pb = new PlatinumBranch("Mumbai-South", 5);
        
        System.out.println("------------------------------------------------");
        pb.showDetails();
    }
}