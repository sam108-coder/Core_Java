package streamApi.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseStringList {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        IntStream.range(0, fruits.size())
                .mapToObj(i -> fruits.get(fruits.size() - 1 - i))
                .forEach(System.out::println);

    }
}
