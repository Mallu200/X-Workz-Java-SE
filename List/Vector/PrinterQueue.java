import java.util.Vector;

class PrinterQueue {
    public static void main(String[] args) {
        Vector<String> printJobs = new Vector<>();

        printJobs.add("AnnualReport.pdf");
        printJobs.add("Invoice_77.docx");

        // Vector has legacy methods not found in ArrayList
        System.out.println("First job in queue: " + printJobs.firstElement());
    }
}