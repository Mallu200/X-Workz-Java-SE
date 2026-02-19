class SocialPost {

    // Reference type for the account holder's name
    static String creatorName;
    // 32-bit integer for standard engagement metrics like likes
    static int likesCount;
    // 64-bit integer to handle viral content reaching billions of views
    static long totalViews;
    // Single-precision decimal for video duration in seconds or minutes
    static float videoLength;
    // Double-precision decimal for high-accuracy GPS coordinate mapping
    static double exactLatitude;
    // Double-precision decimal for high-accuracy GPS coordinate mapping
    static double exactLongitude;
    // 16-bit Unicode character for single-letter content classification
    static char contentCategory;
    // Boolean flag to indicate the verification status of the profile
    static boolean isVerified;
    // 8-bit integer to cap interactions and prevent spamming
    static byte commentLimit;

    public static void main(String insta[]) 
    {
        System.out.println("Main started");

        // Assigning specific values to demonstrate variable storage
        creatorName = "Tech_Explorer_2026";
        likesCount = 45800;
        totalViews = 1500000000L; // Note the 'L' suffix for long literals
        videoLength = 12.5f;      // Note the 'f' suffix for float literals
        exactLatitude = 12.9716;
        exactLongitude = 77.5946;
        contentCategory = 'E';    // 'E' for Education
        isVerified = true;
        commentLimit = 50;

        System.out.println("Creator: " + creatorName);

        System.out.println("Likes: " + likesCount);

        System.out.println("Views: " + totalViews);

        System.out.println("Video Length: " + videoLength + " mins");

        System.out.println("Location: " + exactLatitude + " Latitude, " + exactLongitude + " Longitude");

        System.out.println("Category: " + contentCategory);

        System.out.println("Verified: " + isVerified);

        System.out.println("Comment Limit: " + commentLimit);

        System.out.println("Main ended");
    }
}