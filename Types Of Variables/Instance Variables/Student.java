class Student {
    // Instance variable: Unique to every student
    int rollNo;

    public static void main(String[] args) {
        System.out.println("Main started");

        // Creating student instances
        Student s1 = new Student();
        Student s2 = new Student();

        // Assigning unique IDs
        s1.rollNo = 101;
        s2.rollNo = 102;

        System.out.println("Student 1 Roll No: " + s1.rollNo);
        System.out.println("Student 2 Roll No: " + s2.rollNo);

        System.out.println("Main ended");
    }
}