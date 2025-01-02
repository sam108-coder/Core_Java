package streamApi.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class FirstElement {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberryyyyyy", "kiwi", "berry", "kiwi");

        // If u find something's Better to use Optional class
        Optional<String> p = fruits.stream()
                .filter(str -> str.startsWith("p"))
                .findFirst();

        if (p.isPresent()) {
            String s = p.get();
            System.out.println(s);
        }

        System.out.println("*************************");

        String val = fruits.stream()
                .filter(str -> str.length() > 10)
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("no value"));
        System.out.println(val);
    }
}
