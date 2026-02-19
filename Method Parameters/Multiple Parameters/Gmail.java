class Gmail {
    // Parameter 1: String to, Parameter 2: String subject
    static void composeDraft(String to, String subject) {
        System.out.println("Method composeDraft started");
        
        System.out.println("Recipient: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Status: Saved to drafts");
        
        System.out.println("Method composeDraft ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing arguments: String first, String second
        composeDraft("manager@office.com", "Leave Application");
        
        System.out.println("Main ended");
    }
}