package streamApi.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VowelsWord {
    public static void main(String[] args) {
        List<String> words =
                Arrays.asList("apple", "sky", "pineapple", "myth", "strawberry", "try", "cry", "kiwi");

        words.stream()
                .filter(str -> !str.matches(".*[aeiou].*"))
                .forEach(System.out::println);

        System.out.println("**************************");

        Predicate<String> pred = str -> str.matches(".*[aeiou].*");

        Map<Boolean, List<String>> mapWords = words.stream()
                .collect(Collectors.partitioningBy(pred));

        System.out.println("With Vowels " + mapWords.get(true));
        System.out.println("Without Vowels " + mapWords.get(false));

        System.out.println("****Second Approach****");
        mapWords.forEach((key, list) -> {
            System.out.println(key + "\t" + list);
        });
    }
}
