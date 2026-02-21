interface Camera {
    default void takePhoto() {
        System.out.println("Camera: Captured Image."); // Default camera logic
    }
}

interface Phone {
    default void takePhoto() {
        System.out.println("Phone: Captured Selfie."); // Default phone logic
    }
}

class SmartPhone implements Camera, Phone {
    // Conflict! We must override to choose which one to use
    @Override
    public void takePhoto() {
        Camera.super.takePhoto(); // Explicitly choosing the Camera version
        System.out.println("SmartPhone: Applied filters after capture."); // Additional logic
    }
}

public class MultiFunction {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.takePhoto(); // Resolves the conflict and prints
    }
}