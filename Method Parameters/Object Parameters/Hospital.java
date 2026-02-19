class Patient {
    String name = "John Doe";
    int heartRate = 72;
}

class Hospital {
    // Parameter 'p' is an Object of type Patient
    static void checkVitals(Patient p) {
        System.out.println("Method checkVitals started");
        
        // Accessing object data using the dot (.) operator
        System.out.println("Checking patient: " + p.name);
        System.out.println("Heart Rate: " + p.heartRate + " BPM");
        
        System.out.println("Method checkVitals ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Patient myPatient = new Patient(); // Creating the object
        checkVitals(myPatient);           // Passing the object
        System.out.println("Main ended");
    }
}