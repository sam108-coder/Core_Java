package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class FilterByWord {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        System.out.println("Filter By Word");
        fruits.stream()
                .filter(str -> str.contains("berry"))
                .forEach(System.out::println);

        System.out.println("Filter By Character");
        fruits.stream()
                .filter(str -> str.contains("w"))
                .forEach(System.out::println);
    }
}
