class Geometry {
    // double handles irrational numbers with high accuracy
    static double getPiValue() {
        // Logic: Returns Pi to 10 decimal places
        return 3.1415926535;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        double pi = getPiValue();
        System.out.println("Value of Pi: " + pi);
        System.out.println("Main ended");
    }
}