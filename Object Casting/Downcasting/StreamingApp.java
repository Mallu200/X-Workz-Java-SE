class User {
    void login() {
		System.out.println("User logged in."); }
}
class PremiumUser extends User {
    void downloadVideo() {
		System.out.println("Downloading video for offline use..."); }
}

class StreamingApp {
    public static void main(String[] args) {
        User u = new PremiumUser(); // Upcasting
        
        // Downcasting to give premium access
        PremiumUser p = (PremiumUser) u;
        p.downloadVideo();
    }
}