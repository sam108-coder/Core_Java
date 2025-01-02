package streamApi.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AscendingOrder {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        System.out.println("*****Ascending Order*****");
        fruits.stream()
                .sorted((o1, o2) -> ((Integer) o1.length()).compareTo(o2.length()))
                .forEach(System.out::println);

        System.out.println("*****Descending Order*****");
        fruits.stream()
                .sorted((o1, o2) -> ((Integer) o2.length()).compareTo(o1.length()))
                .forEach(System.out::println);

        System.out.println("*****Descending Order Sorted*****");
        fruits.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
