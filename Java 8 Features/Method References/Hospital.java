import java.util.function.Function;

class Hospital {
	public static void main(String[] args) {
		// Lambda version: name -> name.toUpperCase()
		// Method Reference: ClassName::methodName
		Function<String, String> capitalizer = String::toUpperCase;
		
		// Converts patient name to 'SMITH'
		System.out.println("Patient Name: " + capitalizer.apply("smith"));
	}
}