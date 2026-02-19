class Inbox {
    public static void main(String args[]) {
        System.out.println("Main started");

        String messages[] = {"Hello!", "Win a Prize!", "Meeting at 5", "Discount Now!"};

        // FOR-EACH LOOP: Scanning the inbox
        for (String msg : messages) {
            
            // SPAM FILTER: Does the message contain 'junk' keywords?
            // Using || (OR) means if EITHER word is found, we skip it.
            if (msg.contains("Prize") || msg.contains("Discount")) {
                // When "Win a Prize!" or "Discount Now!" are found:
                // Java jumps straight back to the next 'msg' in the array.
                continue; 
            }
            
            // This line only executes for "clean" messages
            System.out.println("New Message: " + msg);
        }

        System.out.println("Main ended");
    }
}