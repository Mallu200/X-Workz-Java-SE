interface Logger {
    void log(String message);

    // Static: Utility to get current timestamp for logs
    static String getTimestamp() {
        return "2026-02-21 10:00 AM"; // Simplified static time helper
    }
}

class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("[" + Logger.getTimestamp() + "] " + message); // Using static method
    }
}

public class LoggingSystem {
    public static void main(String[] args) {
        ConsoleLogger cl = new ConsoleLogger();
        cl.log("System initialized."); // Final log output
    }
}