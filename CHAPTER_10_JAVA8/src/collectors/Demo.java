package collectors;

// Collectors are used to collect data from Stream.

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("John", "USA");
        Person p2 = new Person("Steve", "JAPAN");
        Person p3 = new Person("Ashok", "INDIA");
        Person p4 = new Person("Ching", "CHINA");
        Person p5 = new Person("Kumar", "INDIA");

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
        List<Person> indians = persons.stream().filter(p -> p.country.equals("INDIA"))
                .toList();
        indians.forEach(System.out::println);

    }
}

class Person {
    String name;
    String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}