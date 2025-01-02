package streamApi.tasks;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmpData {
    public static void main(String[] args) {
        // Creating a list of employees with their details.
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12798.3));
        emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

        System.out.println("-------------------------1------------------------------");
        // 1) How many male and female employees are there in the Organization ?
        Map<String, Long> map1 = emps.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map1);

        System.out.println("-------------------------2------------------------------");
        // 2) Print the name of all department in the organization ?
        emps.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("-------------------------3------------------------------");

        // 3) What is the average age of male and female employees ?
        Map<String, Double> map2 = emps.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(map2);

        System.out.println("-------------------------4------------------------------");

        // 4) Get the details of highest paid employee in the organization?
        Optional<Employee> optional1 = emps.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Employee employee1 = optional1.get();
        System.out.println(employee1);

        System.out.println("-------------------------5------------------------------");

        // 5) Get the names of all employees who have joined after 2015?
        emps.stream().filter(e -> e.yearOfJoining > 2015).map(e -> e.name).forEach(System.out::println);

        System.out.println("-------------------------6------------------------------");

        // 6) Count the number of employees in each department?
        Map<String, Long> map3 = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map3);

        System.out.println("-------------------------7------------------------------");

        // 7) What is the average salary of each department?
        Map<String, Double> map4 = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map4);

        System.out.println("-------------------------8------------------------------");

        // 8) Get the details of youngest male employee in the Development department?
        Optional<Employee> optional2 = emps.stream()
                .filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
                .min(Comparator.comparing(Employee::getAge));
        optional2.ifPresent(System.out::println);

        System.out.println("-------------------------9------------------------------");

        // 9) Who has the most working experience in the organization?
        Optional<Employee> optional3 = emps.stream().min(Comparator.comparing(Employee::getYearOfJoining));
        optional3.ifPresent(System.out::println);

        System.out.println("-------------------------10------------------------------");

        // 10) How many male and female employees are there in the Sales team?
        Map<String, Long> map5 = emps.stream().filter(e -> e.getDepartment().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map5);

        System.out.println("-------------------------11------------------------------");

        // 11) What is the average salary of male and female employees?
        Map<String, Double> averageSalaries = emps.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary of male employees: " + averageSalaries.get("Male"));
        System.out.println("Average salary of female employees: " + averageSalaries.get("Female"));

        System.out.println("-------------------------12------------------------------");

        // 12) List down the names of all employees in each department.
        Map<String, List<String>> employeesByDepartment = emps.stream().collect(Collectors
                .groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        employeesByDepartment.forEach((department, names) -> {
            System.out.println("Department: " + department);
            System.out.println("Employees: " + names);
        });

        System.out.println("-------------------------13------------------------------");

        // 13) What is the average salary and total salary of the whole organization?
        double totalSalary = emps.stream().mapToDouble(Employee::getSalary).sum();
        double averageSalary = emps.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println("Total salary of the organization: " + totalSalary);
        System.out.println("Average salary of the organization: " + averageSalary);

        System.out.println("-------------------------14------------------------------");

        // 14) Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> partitionedByAge = emps.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() <= 25));
        List<Employee> youngerOrEqualTo25 = partitionedByAge.get(true);
        List<Employee> olderThan25 = partitionedByAge.get(false);
        System.out.println("Employees who are younger or equal to 25 years: " + youngerOrEqualTo25);
        System.out.println("Employees who are older than 25 years: " + olderThan25);

        System.out.println("-------------------------15------------------------------");

        // 15) Who is the oldest employee in the organization?
        Employee oldest = emps.stream().max(Comparator.comparingInt(Employee::getAge)).orElse(null);
        System.out.println("Oldest employee: " + oldest);

        System.out.println("-------------------------16------------------------------");

        // 16) Which employee has highest salary?
        Optional<Employee> optional4 = emps.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(optional4.get());

        System.out.println("-------------------------17------------------------------");

        // 17) Get the emp who is having Second-highest salary?
        Optional<Employee> secondHighestSalaryEmployee = emps.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).skip(1).findFirst();
        secondHighestSalaryEmployee.ifPresent(employee -> System.out.println("The employee with the second highest salary is: " + employee.getName() + " (" + employee.getSalary() + ")"));

        System.out.println("-------------------------18------------------------------");

        // sort emps in salary descending order then skip first record
        System.out.println("----------Approach 1----------");
        Optional<Employee> findFirst = emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        findFirst.ifPresent(System.out::println);

        System.out.println("----------Approach 2----------");
        List<Employee> collect = emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(collect.get(1));

        System.out.println("-------------------------19------------------------------");

        // find the highest salary of each department
       /* Map<String, Optional<Employee>> hightestSalariesByDepartment = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy
                                (Comparator.comparingDouble(Employee::getSalary)))));

        hightestSalariesByDepartment.forEach((department, employee) ->
        {
            System.out.println("Department : " + department + ",Highest Salary:" + employee.get().getSalary());
        });
*/
        Map<String, Employee> highestSalariesByDepartment =
                emps.stream() .collect(Collectors.groupingBy
                        (Employee::getDepartment, Collectors.collectingAndThen
                                ( Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
        highestSalariesByDepartment.forEach((department, employee) ->
                System.out.println("Department : " + department + ", Highest Salary : " + employee.getSalary()));

        System.out.println("******************************************END*********************************************");
    }
}

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
}
