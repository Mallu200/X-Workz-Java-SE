class TaxCalculator {
    public static void main(String args[]) {
        System.out.println("Main started");

        double income = 7.5; // 7.5 Lakhs

        // IF-ELSE-IF LADDER: Bracket Evaluation
        // Java stops at the FIRST condition that evaluates to TRUE.
        if (income <= 2.5) {
            System.out.println("Tax: 0%");
        } 
        else if (income > 2.5 && income <= 5.0) {
            // Evaluates: (7.5 > 2.5) AND (7.5 <= 5.0) -> TRUE && FALSE -> FALSE
            System.out.println("Tax: 5%");
        } 
        else if (income > 5.0 && income <= 10.0) {
            // Evaluates: (7.5 > 5.0) AND (7.5 <= 10.0) -> TRUE && TRUE -> TRUE
            System.out.println("Tax: 20%");
        } 
        else {
            // This runs only if income is strictly greater than 10.0
            System.out.println("Tax: 30%");
        }

        System.out.println("Main ended");
    }
}