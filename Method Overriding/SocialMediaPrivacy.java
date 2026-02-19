class Post {
    // Parent method: Default behavior for a general post
    void showContent() {
        System.out.println("Method showContent (Parent) started");
        
        System.out.println("Displaying post to the Public.");
        
        System.out.println("Method showContent (Parent) ended");
    }
}

class PrivatePost extends Post {
    // Overriding the parent's general behavior with specific privacy logic
    @Override
    void showContent() {
        System.out.println("Method showContent (Child) started");
        
        // Specific logic: Changing the visibility of the content
        System.out.println("Displaying post to Followers only.");
        
        System.out.println("Method showContent (Child) ended");
    }
}

class SocialMediaPrivacy {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Object of the subclass (PrivatePost) is created
        PrivatePost myPost = new PrivatePost();
        
        // JVM calls the Overridden version in PrivatePost at runtime
        myPost.showContent();

        System.out.println("Main method ended");
    }
}