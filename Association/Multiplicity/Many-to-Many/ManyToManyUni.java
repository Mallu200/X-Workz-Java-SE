class Course {
    String courseName;

    // --- STEP 1: CONSTRUCTOR ---
    // Courses are created as independent educational modules.
    Course(String name) {
        this.courseName = name;
        // Mandatory SOP to trace course creation in university database
        System.out.println(">> [UNI-CATALOG] Course Published: " + name);
    }
}

class Student {
    String studentName;
    
    // --- STEP 2: THE MANY-SIDE OF THE ASSOCIATION ---
    // Each student holds an array of references to Courses.
    // Note: Multiple students will refer to the same Course objects in memory.
    Course[] syllabus; 

    // Constructor: Linking the 'Many' (Courses) to the 'Student'
    Student(String name, Course[] courses) {
        this.studentName = name;
        
        // This establishes the association by storing the array of course references
        this.syllabus = courses;
        System.out.println(">> [ADMISSIONS] Student '" + name + "' enrolled in " + courses.length + " subjects.");
    }

    void showSchedule() {
        System.out.println("\n--- [OFFICIAL ENROLLMENT REPORT: " + studentName.toUpperCase() + "] ---");
        
        // Safety Check: Verify if student has any courses associated
        if (syllabus != null && syllabus.length > 0) {
            // TRAVERSING THE ASSOCIATION:
            // We loop through the student's syllabus to see which Course objects they are linked to.
            for (Course c : syllabus) {
                System.out.println("  > Registered Course: " + c.courseName);
            }
        } else {
            System.out.println("  > Status: No courses currently selected.");
        }
        System.out.println("--------------------------------------------------\n");
    }
}

class ManyToManyUni {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Initializing University Enrollment Portal...");

        // 1. Create the 'Many' shared objects (Courses)
        Course java = new Course("Java Programming");
        Course db = new Course("Database Systems");
        Course python = new Course("Python AI");

        // 2. Define the first "Many" set (Student 1's selection)
        // Karan takes Java and Database
        Course[] s1Courses = {java, db};

        // 3. Define the second "Many" set (Student 2's selection)
        // Aryan takes Java and Python (Notice 'java' is shared)
        Course[] s2Courses = {java, python};

        // 4. Create Students and inject their specific sets of shared courses
        Student s1 = new Student("Karan", s1Courses);
        Student s2 = new Student("Aryan", s2Courses);

        // 5. Utilize the association to prove the shared link
        s1.showSchedule(); // Shows Java and DB
        s2.showSchedule(); // Shows Java and Python

        System.out.println(">> [SYSTEM] Enrollment cycle complete. Shared links verified.");
    }
}