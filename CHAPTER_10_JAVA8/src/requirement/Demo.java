package requirement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "John", 15500.87);
		Employee e2 = new Employee(2, "Smith", 25000.98);
		Employee e3 = new Employee(3, "Raja", 35000.76);
		Employee e4 = new Employee(4, "Rani", 45000.98);
		Employee e5 = new Employee(5, "Cathy", 55000.65);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);

		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Max Salary :: " + max.get().salary);

		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Min Salry :: " + min.get().salary);

		Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Avg Salary :: " + avg);

	}
}

class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
