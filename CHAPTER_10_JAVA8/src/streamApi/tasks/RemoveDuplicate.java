package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        fruits.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
