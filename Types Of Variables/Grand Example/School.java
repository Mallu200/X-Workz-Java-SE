class School {
    // 1. STATIC: Same for all students
    static String schoolName = "St. Joseph's";

    // 2. INSTANCE: Unique to each student
    String studentName;

    // 3. PARAMETER: 'marks' passed from teacher's record
    public void showResult(int marks) {
        // 4. LOCAL: Result status used only for printing
        String result = (marks >= 35) ? "Pass" : "Fail";

        System.out.println("School: " + schoolName);
        System.out.println("Student: " + studentName);
        System.out.println("Score: " + marks);
        System.out.println("Status: " + result);
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        School s1 = new School();
        s1.studentName = "Rahul";
        s1.showResult(85);

        System.out.println("Main ended");
    }
}