class CloudStorage {
    // long is used for byte-level storage calculations
    static long getUsedSpaceInBytes() {
        // Logic: Returns 500 GB in bytes
        return 536870912000L;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        long bytes = getUsedSpaceInBytes();
        System.out.println("Used Storage: " + bytes + " bytes");
        System.out.println("Main ended");
    }
}