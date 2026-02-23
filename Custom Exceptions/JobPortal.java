class CandidateAgeException extends Exception {
    public CandidateAgeException(String msg) {
        super(msg);
    }
}

public class JobPortal {
    public void registerCandidate(int age) throws CandidateAgeException {
        if (age < 18) {
            throw new CandidateAgeException("Candidate is too young to apply.");
        } else if (age > 60) {
            throw new CandidateAgeException("Candidate exceeds maximum age limit.");
        }
        System.out.println("Candidate registered successfully!");
    }

    public static void main(String[] args) {
        JobPortal portal = new JobPortal();
        try {
            portal.registerCandidate(16);
        } catch (CandidateAgeException e) {
            System.err.println("HR Policy Violation: " + e.getMessage());
        }
    }
}