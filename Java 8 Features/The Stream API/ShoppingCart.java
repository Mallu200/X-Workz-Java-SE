import java.util.*;
import java.util.stream.*;

class ShoppingCart {
	public static void main(String[] args) {
		List<Double> prices = Arrays.asList(1200.0, 450.0, 890.0, 150.0);
		
		// Source -> Intermediate (filter) -> Terminal (collect)
		List<Double> expensive = prices.stream()
									   .filter(p -> p > 500.0)
									   .collect(Collectors.toList());
					
		// Filters prices above 500 and stores them in a new list
		System.out.println("Premium Items: " + expensive);
	}
}