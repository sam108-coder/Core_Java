package mappingOperations;

import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("John", 35, 55000.76);
		Employee e2 = new Employee("David", 25, 45000.98);
		Employee e3 = new Employee("Buttler", 35, 35000.76);
		Employee e4 = new Employee("Steve", 45, 65000.90);

		Stream<Employee> stream = Stream.of(e1, e2, e3, e4);

		// stream.filter(e -> e.salary >= 50000.00).map(e -> e.name + "-" +
		// e.age).forEach(e -> System.out.println(e));

		stream.filter(e -> e.salary >= 50000.00).forEach(e -> System.out.println(e.name + "-" + e.age));

	}
}

class Employee {
 
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}

//  get Emp Name and Emp age whose salary is >=50,000 using stream api
