public class BridgeSystem {
    public static void main(String[] args) {
        String laneLeft = "Left Side of Bridge";
        String laneRight = "Right Side of Bridge";

        new Thread(() -> {
            synchronized (laneLeft) {
                System.out.println("Truck 1: Occupying Left Side.");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (laneRight) {
                    System.out.println("Truck 1: Crossed successfully.");
                }
            }
        }, "Truck-1").start();

        new Thread(() -> {
            synchronized (laneRight) {
                System.out.println("Truck 2: Occupying Right Side.");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (laneLeft) {
                    System.out.println("Truck 2: Crossed successfully.");
                }
            }
        }, "Truck-2").start();
    }
}