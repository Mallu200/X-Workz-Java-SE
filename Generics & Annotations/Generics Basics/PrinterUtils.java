public class PrinterUtils {
	// Generic method to print any array type
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println("[" + element + "]");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] nums = {10, 20, 30};
		String[] languages = {"Java", "Kotlin", "Swift"};
		Double[] prices = {19.99, 5.50};
		
		printArray(nums);
		printArray(languages);
		printArray(prices);
	}
}