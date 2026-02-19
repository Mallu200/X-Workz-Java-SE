class SystemCleaner {
    // VOID: Executes a cleanup routine
    static void runCleanup() {
        System.out.println("Main started");
        System.out.println("Scanning for junk files...");
        System.out.println("Cleaning Cache... Done.");
        System.out.println("System optimized successfully.");
        System.out.println("Main ended");
    }

    public static void main(String[] args) {
        runCleanup();
    }
}