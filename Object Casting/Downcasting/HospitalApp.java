class Employee {
	void checkIn() {
		System.out.println("Checked in at the hospital.");
	}
}

class Doctor extends Employee {
	void performSurgery() {
		System.out.println("Doctor is performing surgery.");
	}
}

class HospitalApp {
	public static void main(String[] args) {
		Employee emp = new Doctor(); // Upcasting
		emp.checkIn();
		
		// Downcasting to access Doctor-specific method
		Doctor doc = (Doctor) emp;
		doc.performSurgery();
	}
}