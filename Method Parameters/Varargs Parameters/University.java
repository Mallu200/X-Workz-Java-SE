class University {
    // Varargs is great for list-based registration
    static void enrollStudent(String studentName, String... courses) {
        System.out.println("Method enrollStudent started");
        
        System.out.println("Student: " + studentName);
        System.out.println("Enrolling in " + courses.length + " courses:");
        for (String c : courses) {
            System.out.println("Course: " + c);
        }
        
        System.out.println("Method enrollStudent ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Mixing a normal parameter (studentName) with Varargs (courses)
        enrollStudent("Zayan", "Java", "Python", "SQL", "Cloud");
        
        System.out.println("Main ended");
    }
}