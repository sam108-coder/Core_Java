package mappingOperations;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");

		// print name with its length which are starting with 'A' using Stream api

		names.stream().filter(name -> name.startsWith("A")).map(name -> name + "-" + name.length())
				.forEach(i -> System.out.println(i));

	}
}
