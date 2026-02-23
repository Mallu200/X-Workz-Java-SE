class Post {
    private int likes = 0;

    public synchronized void addLike() {
        likes++; 
    }
    public int getLikes() { return likes; }
}

public class InstagramClone {
    public static void main(String[] args) throws InterruptedException {
        Post viralPost = new Post();
        
        // Create 1000 threads, each adding 1 like
        Thread[] threads = new Thread[1000];
        for(int i = 0; i < 1000; i++) {
            threads[i] = new Thread(viralPost::addLike);
            threads[i].start();
        }

        for(Thread t : threads) t.join(); // Wait for all to finish
        
        System.out.println("Total Likes: " + viralPost.getLikes()); // Always 1000
    }
}