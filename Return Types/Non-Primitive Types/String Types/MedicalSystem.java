class MedicalSystem {
    // String can combine multiple pieces of data into one text block
    static String getDiagnosis() {
        // Logic: Returns a text-based health summary
        return "Patient is healthy. Recommended: Drink more water.";
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        String report = getDiagnosis();
        System.out.println("Medical Report: " + report);
        System.out.println("Main ended");
    }
}