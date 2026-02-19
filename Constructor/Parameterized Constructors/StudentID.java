class StudentID {
    String name;
    int rollNo;
    
    // Parameterized Constructor: Accepts data from the outside
    // 'this' keyword refers to the current object's variables
    StudentID(String name, int rollNo) {
        System.out.println("Constructor StudentID(String, int) started");
        
        // Logic: Transferring local parameter data to the object's memory
        this.name = name;
        this.rollNo = rollNo;
        
        System.out.println("ID Generated: " + name + " | Roll: " + rollNo);
        System.out.println("Constructor StudentID(String, int) ended");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method started");
        
        // Passing specific values during object creation
        StudentID s1 = new StudentID("Arjun", 101);
        StudentID s2 = new StudentID("Kushi", 102);
        
        System.out.println("Created " + s1.name + " and " + s2.name);
        System.out.println("Main method ended");
    }
}