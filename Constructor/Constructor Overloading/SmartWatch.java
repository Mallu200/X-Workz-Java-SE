class SmartWatch {
    int h, m;

    // Version 1: No-Arg Constructor
    // Logic: Resets the watch to midnight (00:00)
    SmartWatch() {
        System.out.println("Constructor 1 (Default) started");
        this.h = 0;
        this.m = 0;
    }

    // Version 2: Parameterized Constructor
    // Logic: Sets the watch to a specific time provided by the user
    SmartWatch(int h, int m) {
        System.out.println("Constructor 2 (Parameterized) started");
        this.h = h;
        this.m = m;
    }
	
    void time() {
        System.out.println("Time:- " + h + " hrs : " + m + " mins");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");

        // Object 1: Uses the 'Reset' logic
        SmartWatch w1 = new SmartWatch();
        
        // Object 2: Uses the 'Manual Set' logic
        SmartWatch w2 = new SmartWatch(10, 30);
        
        w1.time();
        w2.time();

        System.out.println("Main method ended");
    }
}