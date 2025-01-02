package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class RemoveWord {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        System.out.println("Remove Word start with b ");
        fruits.stream()
                .filter(str -> !str.startsWith("b"))
                .forEach(System.out::println);
    }
}
