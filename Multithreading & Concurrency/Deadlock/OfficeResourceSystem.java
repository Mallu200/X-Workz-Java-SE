public class OfficeResourceSystem {
    public static void main(String[] args) {
        String printer = "Printer";
        String scanner = "Scanner";

        Thread employeeA = new Thread(() -> {
            synchronized (printer) {
                System.out.println("Employee A: Using Printer...");
                try { Thread.sleep(100); } catch (Exception e) {}
                
                System.out.println("Employee A: Waiting for Scanner...");
                synchronized (scanner) {
                    System.out.println("Employee A: Scanning complete.");
                }
            }
        }, "Employee-A");

        Thread employeeB = new Thread(() -> {
            synchronized (scanner) {
                System.out.println("Employee B: Using Scanner...");
                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Employee B: Waiting for Printer...");
                synchronized (printer) {
                    System.out.println("Employee B: Printing complete.");
                }
            }
        }, "Employee-B");

        employeeA.start();
        employeeB.start();
    }
}