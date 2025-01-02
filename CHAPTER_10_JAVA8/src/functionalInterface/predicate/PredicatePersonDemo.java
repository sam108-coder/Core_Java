package functionalInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class PredicatePersonDemo {

	public static void main(String[] args) {

		Person p1 = new Person("John", 26);
		Person p2 = new Person("Smith", 16);
		Person p3 = new Person("Raja", 36);
		Person p4 = new Person("Rani", 6);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		Predicate<Person> predicate = p -> p.age >= 18;

		for (Person person : persons) {
			if (predicate.test(person)) {
				System.out.println(person.name);
			} 
		}

	}
}
