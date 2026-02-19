class Doctor {
    String name;
    String specialty;

    // --- STEP 1: CONSTRUCTOR ---
    // Represents the individual doctor being registered in the medical council.
    Doctor(String name, String spec) {
        this.name = name;
        this.specialty = spec;
        // Mandatory SOP to track object creation
        System.out.println(">> [MEDICAL-COUNCIL] Credential Verified: Dr. " + name + " [" + spec + "]");
    }
}

class Hospital {
    String hName;
    
    // --- STEP 2: THE ONE-TO-MANY LINK ---
    // The Hospital class holds an array reference. 
    // This allows one Hospital instance to point to multiple Doctor instances.
    Doctor[] doctors;

    // Constructor: Assigning the 'Many' (Doctors) to the 'One' (Hospital)
    Hospital(String hName, Doctor[] doctors) {
        this.hName = hName;
        this.doctors = doctors; // Linking the array address
        System.out.println(">> [ADMIN] Hospital '" + hName + "' has updated its department staff.");
    }

    void listStaff() {
        System.out.println("\n--- [HOSPITAL STAFF DIRECTORY: " + hName.toUpperCase() + "] ---");
        
        // Safety Check: Ensure the association is not empty
        if (doctors != null) {
            // TRAVERSING THE MANY-SIDE:
            // We use an enhanced for-loop to visit each Doctor object in the associated array
            for (Doctor d : doctors) {
                System.out.println(" >> Staff: Dr. " + d.name + " | Specialty: " + d.specialty);
            }
        } else {
            System.out.println(" >> Alert: No doctors are currently associated with this hospital.");
        }
        System.out.println("--------------------------------------------------\n");
    }
}

class OneToManyHealth {
    public static void main(String[] args) {
        System.out.println(">> [SYS] Initializing Healthcare Association Module...");

        // 1. Create the 'Many' objects (Doctors) independently
        Doctor d1 = new Doctor("Bose", "Cardiology");
        Doctor d2 = new Doctor("Verma", "Neurology");

        // 2. Wrap the 'Many' into a data structure (Array)
        Doctor[] staff = {d1, d2};

        // 3. Create the 'One' (Hospital) and inject the 'Many' (Staff)
        Hospital cityHospital = new Hospital("City Care Center", staff);

        // 4. Utilize the association through the Hospital object
        cityHospital.listStaff();

        System.out.println(">> [SYS] Healthcare Module: Session Finished.");
    }
}