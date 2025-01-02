package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class NoDigits {
    public static void main(String[] args) {
        List<String> words =
                Arrays.asList("apple", "12345", "123", "berry", "hello900", "kiwi", "44fly");

        words.stream()
                .filter(str -> !str.matches(".*[0-9].*"))
                .forEach(System.out::println);
    }
}
