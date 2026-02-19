class Hospital {
    // 1. STATIC: All patients belong to the same hospital
    static String hospitalName = "Apollo Hospital";

    // 2. INSTANCE: Every patient has their own name
    String patientName;

    // 3. PARAMETER: 'medicine' is passed as input during the visit
    public void checkup(String medicine) {
        // 4. LOCAL: Only used during the checkup process
        int consultationFee = 500;

        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Prescribed: " + medicine);
        System.out.println("Fee to pay: ₹" + consultationFee);
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        Hospital p1 = new Hospital();
        p1.patientName = "Suresh";
        p1.checkup("Paracetamol");

        System.out.println("Main ended");
    }
}