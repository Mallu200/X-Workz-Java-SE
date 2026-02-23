class SmartDevice {
    String name;
    public SmartDevice(String name) { this.name = name; }

    public void executeRoutine(SmartDevice other) {
        synchronized (this) {
            System.out.println("Routine started on " + this.name);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            
            synchronized (other) {
                System.out.println("Routine finished on " + other.name);
            }
        }
    }
}

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartDevice lights = new SmartDevice("Living Room Lights");
        SmartDevice doorLock = new SmartDevice("Front Door Lock");

        // "Goodnight" locks door then turns off lights
        new Thread(() -> doorLock.executeRoutine(lights), "Goodnight-Routine").start();
        
        // "Motion-Sensor" turns on lights then checks door
        new Thread(() -> lights.executeRoutine(doorLock), "Motion-Routine").start();
    }
}