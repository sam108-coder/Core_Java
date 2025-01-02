package slicingOperations;

import java.util.Arrays;
import java.util.List;

// distinct() - To get unique elements from the Stream
// limit(long maxSize) - Get list elements from the stream based on given size
// skip(long n) - It is used to skip given number of elements from starting positions of the stream.

public class Demo1 {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");

		courses.stream().limit(3).forEach(c -> System.out.println(c));

		System.out.println("========================================");

		courses.stream().skip(3).forEach(c -> System.out.println(c));

		System.out.println("==========================================");
		
		List<String> names = Arrays.asList("raja","rani","raja","rani","guru");

		names.stream().distinct().forEach(name->System.out.println(name));
		
		
	}
}
