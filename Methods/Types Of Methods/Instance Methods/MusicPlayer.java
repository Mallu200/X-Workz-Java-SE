class MusicPlayer {
    // STATE: Every MusicPlayer instance starts with volume 15
    int volume = 15;

    // INSTANCE METHOD: Modifies the 'volume' variable of a specific object
    void changeVolume(int newVol) {
        // Logic: Assign the input value to the instance variable
        volume = newVol;
        System.out.println("Volume set to: " + volume);
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // Step 1: Create the object (Instance)
        MusicPlayer spotify = new MusicPlayer();
        
        // Step 2: Access the instance method to change its specific state
        // This takes the '50' and stores it in spotify's 'volume' slot
        spotify.changeVolume(50);
        
        // Let's create a second player to prove independence
        MusicPlayer appleMusic = new MusicPlayer();
        System.out.println("Apple Music volume is: " + appleMusic.volume); // Still 15!

        System.out.println("Main ended");
    }
}