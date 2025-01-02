package streamApi.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWord {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        Optional<String> max = fruits.stream()
                .max(Comparator.comparing(String::length));

        max.ifPresent(str -> System.out.println(str.toUpperCase()));

    }
}
