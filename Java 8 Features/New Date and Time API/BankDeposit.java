import java.time.LocalDate;

class BankDeposit {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // Current date
		LocalDate maturityDate = today.plusYears(1); // Adding 1 year
		
		// Calculates the date exactly one year from today
		System.out.println("Deposit matures on: " + maturityDate);		
	}
}