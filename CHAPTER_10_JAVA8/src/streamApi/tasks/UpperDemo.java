package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class UpperDemo {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        // with lambda expression
        fruits.stream()
                .map(str->str.toUpperCase())
                .sorted()
                .forEach(str-> System.out.println(str));

        System.out.println("********************");

        // with method reference
        fruits.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
