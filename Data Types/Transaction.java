class Transaction {
	
	// Reference type used to store the name of the financial institution
	static String bankName;
	// 64-bit long integer to accommodate 12-16 digit account numbers
	static long accountNumber;
	// Double-precision floating point for high-accuracy financial balances
	static double transferAmount;
	// Single-precision decimal for tax rates or percentage calculations
	static float serviceTax;
	// 32-bit standard integer for generating unique system identifiers
	static int transactionId;
	// 16-bit short integer for small numerical codes like a 4-digit PIN
	static short securityPin;
	// 8-bit tiny integer used for tracking login or input attempts
	static byte attemptCount;
	// 16-bit Unicode character for representing global currency signs
	static char currencySymbol;
	// Logical boolean type to track the binary outcome of the payment
	static boolean isSuccess;

	public static void main(String phonePe[]) 
	{
		System.out.println("Main started");

		// Assigning values to represent a real-world transaction record
		bankName = "State Bank of India";
		accountNumber = 345678901234L; // 'L' suffix for long literal
		transferAmount = 15500.75;
		serviceTax = 18.0f;             // 'f' suffix for float literal
		transactionId = 8849201;
		securityPin = 1234;
		attemptCount = 1;
		currencySymbol = '₹';
		isSuccess = true;

		System.out.println("Bank: " + bankName);

		System.out.println("Account Number: " + accountNumber);

		System.out.println("Transaction ID: " + transactionId);

		System.out.println("Amount: " + currencySymbol + transferAmount);

		System.out.println("Service Tax: " + serviceTax + "%");

		System.out.println("Security PIN: " + securityPin);

		System.out.println("Attempts: " + attemptCount);

		System.out.println("Success Status: " + isSuccess);

		System.out.println("Main ended");
	}
}