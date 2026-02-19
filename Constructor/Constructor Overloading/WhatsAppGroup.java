class WhatsAppGroup {
    String title;
    boolean isPrivate;

    // Version 1: Only needs a Title
    // Logic: If privacy isn't specified, we assume it's a public group (false)
    WhatsAppGroup(String title) {
        System.out.println("Constructor 1 (String) started");
        this.title = title;
        this.isPrivate = false; 
    }

    // Version 2: Needs Title AND Privacy status
    // Logic: Allows the user to explicitly set the group as private or public
    WhatsAppGroup(String title, boolean status) {
        System.out.println("Constructor 2 (String, boolean) started");
        this.title = title;
        this.isPrivate = status;
    }
	
    void details() {
        System.out.println("Group: " + title + " | Private: " + isPrivate);
    }

    public static void main(String args[]) {
        System.out.println("Main method started");

        // Calls Constructor 1
        WhatsAppGroup g1 = new WhatsAppGroup("Family");
        
        // Calls Constructor 2
        WhatsAppGroup g2 = new WhatsAppGroup("Work", true);
        
        g1.details();
        g2.details();

        System.out.println("Main method ended");
    }
}