class InstagramProfile {
    String handle;
    String bio;

    // Parameterized Constructor
    // Logic: Every profile must have a handle and a bio from the start
    InstagramProfile(String handle, String bio) {
        System.out.println("Constructor InstagramProfile(String, String) started");
        
        this.handle = handle; // Saving the unique handle
        this.bio = bio;       // Saving the personal bio
        
        System.out.println("Profile created for @" + handle);
        System.out.println("Constructor InstagramProfile(String, String) ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        // Passing the user's data directly into the constructor
        InstagramProfile myUser = new InstagramProfile("coder_life", "Eating code for breakfast.");
        
        // Checking the profile data
        System.out.println("Handle: @" + myUser.handle);
        System.out.println("Bio: " + myUser.bio);
        
        System.out.println("Main method ended");
    }
}