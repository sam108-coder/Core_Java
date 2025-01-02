package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class LengthDemo {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        fruits.stream()
                .filter(str->str.length() > 5)
                .forEach(System.out::println);
    }
}
