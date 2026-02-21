import java.util.PriorityQueue;
import java.util.Queue;

class PrinterSpooler {
    public static void main(String[] args) {
        // PriorityQueue sorts elements automatically
        Queue<Integer> printJobs = new PriorityQueue<>();

        printJobs.add(5); // 5 pages
        printJobs.add(1); // 1 page
        printJobs.add(10); // 10 pages

        // It will process the 1-page document first
        while (!printJobs.isEmpty()) {
            System.out.println("Printing job with " + printJobs.poll() + " pages.");
        }
    }
}