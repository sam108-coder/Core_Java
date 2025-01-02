package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class NameLength {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        fruits.stream()
         //       .map(str -> str.length())
         //       .sorted()
                .forEach(str-> System.out.println(str +" : " +str.length()));
    }
}
