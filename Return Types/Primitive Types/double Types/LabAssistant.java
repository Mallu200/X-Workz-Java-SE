class LabAssistant {
    // double is used in science for exact measurements
    static double getOxygenAtomicWeight() {
        // Logic: Returns the atomic mass of Oxygen
        return 15.9994;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        double weight = getOxygenAtomicWeight();
        System.out.println("Oxygen Atomic Weight: " + weight + " u");
        System.out.println("Main ended");
    }
}