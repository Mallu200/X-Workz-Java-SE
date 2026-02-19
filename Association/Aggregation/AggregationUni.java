class Professor {
    String name;
    String subject;

    // --- STEP 1: INDEPENDENT LIFECYCLE ---
    // Professors are created outside the context of a specific department.
    Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
        System.out.println(">> [RECRUITMENT] Memory Allocated: Professor " + name + " is now in the talent pool.");
    }
}

class Department {
    String deptName;
    
    // --- STEP 2: AGGREGATION LINK ---
    // The Department holds references to Professor objects.
    // This is a "Weak Link" because the Department doesn't manage the 'new' keyword for Professors.
    Professor[] professors;

    Department(String deptName, Professor[] professors) {
        this.deptName = deptName;
        this.professors = professors;
        System.out.println(">> [ADMIN] " + deptName + " has been established with " + professors.length + " staff members.");
    }

    void displayDept() {
        System.out.println("\n--- [DEPARTMENTAL ROSTER: " + deptName.toUpperCase() + "] ---");
        
        // Safety Check: Avoid NullPointerException if professors array is missing
        if (professors != null) {
            for (Professor p : professors) {
                System.out.println(" >> Faculty: " + p.name + " | Expertise: " + p.subject);
            }
        }
        System.out.println("----------------------------------------------\n");
    }
}

class AggregationUni {
    public static void main(String[] args) {
        System.out.println("--- [UNIVERSITY SESSION START] ---");

        // 1. Create 'Child' objects independently in the Heap
        Professor p1 = new Professor("Dr. Sharma", "Physics");
        Professor p2 = new Professor("Dr. Iyer", "Mathematics");

        // 2. Create 'Parent' and pass existing children (Aggregation)
        Department physicsDept = new Department("Science Dept", new Professor[]{p1, p2});
        physicsDept.displayDept();

        // 3. THE WEAK LINK TEST:
        // We destroy the Parent object
        physicsDept = null; 
        System.out.println(">> [SYSTEM] Department object has been set to NULL (Destroyed).");
        
        // 4. Verification of Independence
        // Even though 'physicsDept' is gone, 'p1' and 'p2' are still accessible via main's references.
        System.out.println(">> [VERIFY] Professor Life Check: " + p1.name + " is still active in memory.");
        System.out.println(">> [VERIFY] Professor Life Check: " + p2.name + " is still active in memory.");

        System.out.println("--- [UNIVERSITY SESSION END] ---");
    }
}