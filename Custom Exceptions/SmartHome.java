class DeviceOfflineException extends Exception {
    String deviceId;
    public DeviceOfflineException(String id, String message) {
        super(message);
        this.deviceId = id;
    }
}

public class SmartHome {
    public void toggleLight(String id, boolean isConnected) throws DeviceOfflineException {
        if (!isConnected) {
            throw new DeviceOfflineException(id, "Device is not reachable on the network.");
        }
        System.out.println("Light " + id + " turned ON.");
    }

    public static void main(String[] args) {
        SmartHome hub = new SmartHome();
        try {
            hub.toggleLight("Kitchen_Bulb_01", false);
        } catch (DeviceOfflineException e) {
            System.err.println("Hardware Error: " + e.getMessage());
            System.err.println("Troubleshoot Device ID: " + e.deviceId);
        }
    }
}