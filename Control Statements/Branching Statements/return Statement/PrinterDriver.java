class PrinterDriver {
    public static void main(String args[]) {
        System.out.println("Main started");

        int inkLevel = 0; // Percent

        // GUARD CLAUSE: Preventing mechanical failure
        if (inkLevel == 0) {
            System.out.println("Printer Offline: Replace Ink Cartridge.");
            
            // THE RETURN:
            // This is the "Shutdown" command.
            // Java will NOT proceed to warm up or print.
            return; 
        }

        // The "Happy Path": Only reached if inkLevel > 0
        System.out.println("Warming up printer...");
        System.out.println("Printing page 1 of 10...");

        System.out.println("Main ended");
    }
}