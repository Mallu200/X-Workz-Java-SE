class PromoEngine {
    // boolean determines if a process should continue
    static boolean isCouponExpired() {
        // Logic: Compares current date with expiry date
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        boolean expired = isCouponExpired();
        System.out.println("Coupon is usable: " + !expired); // Using '!' to flip the result
        System.out.println("Main ended");
    }
}