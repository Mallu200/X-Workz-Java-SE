class Uber {
    public static void main(String args[]) {
        System.out.println("Main started");

        String cabType = "Prime";

        // IF-ELSE-IF LADDER: Multi-Category Logic
        // Java checks these one by one from top to bottom.
        if (cabType == "Mini") {
            System.out.println("Rate: ₹10 per km");
        } 
        else if (cabType == "Prime") {
            // Once this matches, Java skips all remaining 'else if' and 'else' blocks.
            System.out.println("Rate: ₹15 per km");
        } 
        else if (cabType == "SUV") {
            System.out.println("Rate: ₹25 per km");
        } 
        else {
            // The 'Final Catch': Runs only if NONE of the above match.
            System.out.println("Invalid Cab Type Selected.");
        }

        System.out.println("Main ended");
    }
}