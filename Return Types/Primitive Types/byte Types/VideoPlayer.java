class VideoPlayer {
    // byte works for small playback speed presets
    static byte getPlaybackSpeed() {
        // Logic: Returns 2 for '2x Speed'
        return 2;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        byte speed = getPlaybackSpeed();
        System.out.println("Current Playback Speed: " + speed + "x");
        System.out.println("Main ended");
    }
}