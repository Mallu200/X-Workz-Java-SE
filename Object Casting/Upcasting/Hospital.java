class Employee {
    void work() {
	System.out.println("Employee is working..."); }
}

class Doctor extends Employee {
    void work() {
	System.out.println("Doctor is treating patients..."); }
}

class Hospital {
    public static void main(String[] args) {
        // Upcasting: Doctor is treated as an Employee
        Employee emp = new Doctor();
        emp.work();
    }
}