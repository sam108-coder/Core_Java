package mappingOperations;

import java.util.Arrays;
import java.util.List;

// Mapping operations are belongs to intermediate operations in the stream api
// Mapping operations are used to transform the stream elements 
// and return transformed elements as new Stream.

public class Demo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("india", "usa", "uk", "japan");

		// legacy approach
		/*
		 * for (String name : names) { System.out.println(name.toUpperCase()); }
		 */

		names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));

		names.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i)); 
	}
}
