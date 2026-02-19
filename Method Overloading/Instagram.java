class Instagram {
    // Version 1: Single String parameter
    // Used for text-only status updates
    void post(String caption) {
        System.out.println("Method post(String) started");
        
        System.out.println("Posted text: " + caption);
        
        System.out.println("Method post(String) ended");
    }

    // Version 2: String and int parameters
    // Overloading: Same name 'post', but adds an image ID
    void post(String caption, int imageId) {
        System.out.println("Method post(String, int) started");
        
        System.out.println("Posted Image #" + imageId + " with caption: " + caption);
        System.out.println("Status: Uploading media to server...");
        
        System.out.println("Method post(String, int) ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        Instagram ig = new Instagram();
        
        // Matches Version 1 (text only)
        ig.post("Feeling Happy!");
        
        System.out.println("--------------------");
        
        // Matches Version 2 (text + number)
        ig.post("Vacation vibes", 404);
        
        System.out.println("Main method ended");
    }
}