class DateFormatter {
    public static void main(String args[]) {
        System.out.println("Main started");

        String oldDate = "17/02/2026";
        
        // PRE-DEFINED METHOD: String.replace(target, replacement)
        // Note: Strings in Java are "immutable" (unchangeable). 
        // .replace() doesn't change oldDate; it creates a BRAND NEW string.
        String newDate = oldDate.replace("/", "-");
        
        System.out.println("Original: " + oldDate);
        System.out.println("Standardized Date: " + newDate);

        System.out.println("Main ended");
    }
}