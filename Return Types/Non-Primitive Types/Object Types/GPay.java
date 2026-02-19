class Receipt {
    long transactionId = 9876543210L;
    String status = "SUCCESS";
}

class GPay {
    // Returns a 'Receipt' object
    static Receipt lastTransaction() {
        return new Receipt();
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Receipt r = lastTransaction();
        System.out.println("ID: " + r.transactionId + " Status: " + r.status);
        System.out.println("Main ended");
    }
}