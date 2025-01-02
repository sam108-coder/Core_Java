package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class RemoveNullStrings {
    public static void main(String[] args) {
        List<String> words =
                Arrays.asList("apple", "", "pineapple", null, "strawberry", null, "", "null");

        words.stream()
                .filter(str -> str != null && (!str.isEmpty()))
                .forEach(System.out::println);

    }
}
