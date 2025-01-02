package streamApi.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLetter {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "papaya", "blueberry", "avocado");

        // group a list of strings by the first letter of each string using streams
        //  a apple, avocado
        //  o orange
        //  p pineapple, papaya
        //  b berry, blueberry
        //  s strawberry

        Map<Character, List<String>> mapWord = fruits.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));

        mapWord.forEach((key, listStr) -> {
            System.out.println(key + "\t" + listStr);
            //   System.out.println(key);
            //   listStr.forEach(System.out::println);
        });

        System.out.println("****************************");

        // group a list of strings by the length of the string
        fruits.stream()
                .collect(Collectors.groupingBy(String::length))
                .forEach((keyLen, listStr) -> {
                    System.out.println(keyLen + "\t" + listStr);
                });

        System.out.println("****************************");

        // create a map where the key is the last letter of the string
        // and the value is a list of strings that end with that letter using streams
        Map<Character, List<String>> mapWord1 = fruits.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(str.length() - 1)));
        mapWord1.forEach((key, listStr) -> {
            System.out.println(key + "\t" + listStr);
        });

    }
}
