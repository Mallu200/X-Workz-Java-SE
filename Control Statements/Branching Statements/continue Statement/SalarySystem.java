class SalarySystem {
    public static void main(String args[]) {
        System.out.println("Main started");

        String staff[] = {"Perm_Emp", "Freelancer", "Perm_Emp", "Perm_Emp"};

        // FOR-EACH LOOP: Iterating through the staff list
        for (String type : staff) {
            
            // FILTER CHECK: Is this a Freelancer?
            if (type == "Freelancer") {
                // When "Freelancer" is found, we notify and skip.
                System.out.println("Skipping Freelancer... processing separately.");
                
                // THE CONTINUE:
                // Java stops right here for the current 'type'.
                // It ignores the "Salary credited" line and jumps to the next staff member.
                continue; 
            }
            
            // This line only executes for "Perm_Emp"
            System.out.println("Salary credited for: " + type);
        }

        System.out.println("Main ended");
    }
}