// Custom Checked Exception
class UnauthorizedAccessException extends Exception {
    public UnauthorizedAccessException(String message) {
        super(message); // Passes message to Throwable parent
    }
}

public class SecuritySystem {
    // 'throws' indicates the caller must handle this
    public static void checkAccess(int clearanceLevel) throws UnauthorizedAccessException {
        if (clearanceLevel < 5) {
            // 'throw' manually triggers the exception
            throw new UnauthorizedAccessException("Access Denied: Level 5 clearance required.");
        }
        System.out.println("Access Granted. Welcome to the Vault.");
    }

    public static void main(String[] args) {
        try {
            checkAccess(3); 
        } catch (UnauthorizedAccessException e) {
            System.err.println("Security Alert: " + e.getMessage());
        }
    }
}