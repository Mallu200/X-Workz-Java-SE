// Extending Thread is simpler for small, specific tasks
class MusicThread extends Thread {
	public void run() {
		// Plays background music in a separate thread
		System.out.println("Playing background music..." + Thread.currentThread().getName());
	}
}

class PhysicsThread extends Thread {
	public void run() {
		// Calculates car physics simultaneously
		System.out.println("Calculating car movement... " + Thread.currentThread().getName());
	}
}

public class GameInstance {
	public static void main(String[] args) {
		new MusicThread().start();
		new PhysicsThread().start();
	}
}