package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {
        Person1 p1 = new Person1("John", "USA");
        Person1 p2 = new Person1("Steve", "JAPAN");
        Person1 p3 = new Person1("Ashok", "INDIA");
        Person1 p4 = new Person1("Ching", "CHINA");
        Person1 p5 = new Person1("Kumar", "INDIA");

        List<Person1> persons = Arrays.asList(p1, p2, p3, p4, p5);

        // collect names of persons who are belongs to india and store into names
        // collections

        List<String> names = persons.stream().filter(p -> p.country.equals("INDIA")).map(p -> p.name)
                .collect(Collectors.toList());

        System.out.println(names);

        //	names.forEach(c -> System.out.println(c));

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

