class MediaFile {
    void play() {
	System.out.println("Playing media..."); }
}

class MP3 extends MediaFile {
    void play() { 
	System.out.println("Playing Audio song..."); }
}

class VLCPlayer {
    public static void main(String[] args) {
        // Upcasting: MP3 file is treated as a MediaFile
        MediaFile file = new MP3();
        file.play();
    }
}