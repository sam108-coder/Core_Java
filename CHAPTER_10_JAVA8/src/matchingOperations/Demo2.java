package matchingOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		Person1 p1 = new Person1("John", "USA");
		Person1 p2 = new Person1("Steve", "JAPAN");
		Person1 p3 = new Person1("Ashok", "INDIA");
		Person1 p4 = new Person1("Ching", "CHINA");
		Person1 p5 = new Person1("Kumar", "INDIA");

		List<Person1> persons = Arrays.asList(p1, p2, p3, p4, p5);

		Optional<Person1> findFirst1 = persons.stream().filter(p -> p.country.equals("INDIA")).findFirst();

		if (findFirst1.isPresent()) {
			System.out.println(findFirst1.get());
		}

		System.out.println("========================================");

		Optional<Person1> findFirst2 = persons.stream().filter(p -> p.country.equals("INDIA")).findAny();

		if (findFirst2.isPresent()) {
			System.out.println(findFirst2.get());
		}

	}

}

class Person1 {

	String name;
	String country;

	public Person1(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", country=" + country + "]";
	}

}
