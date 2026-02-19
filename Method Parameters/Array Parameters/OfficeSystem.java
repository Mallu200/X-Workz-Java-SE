class OfficeSystem {
    // Parameter 'ids' receives a collection of employee codes
    static void markAttendance(int[] ids) {
        System.out.println("Method markAttendance started");
        
        System.out.println("Marking " + ids.length + " employees present...");
        for (int id : ids) {
            System.out.println("ID: " + id + " -> Status: PRESENT");
        }
        
        System.out.println("Method markAttendance ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        int[] staffIds = {101, 105, 110};
        markAttendance(staffIds);
        System.out.println("Main ended");
    }
}