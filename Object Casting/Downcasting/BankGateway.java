class Payment {
    void status() {
		System.out.println("Payment pending..."); }
}
class CreditCard extends Payment {
    void verifyCVV() {
		System.out.println("CVV Verified successfully."); }
}

class BankGateway {
    public static void main(String[] args) {
        Payment p = new CreditCard(); // Upcasting
        
        // Downcasting to verify security details
        CreditCard card = (CreditCard) p;
        card.verifyCVV();
    }
}