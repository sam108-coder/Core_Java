package flatMapAndMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Java Streams", "FlatMap Example");

        //using map
        List<String[]> wordsArray = sentences.stream()
                .map(sentence -> sentence.split(" "))
                .collect(Collectors.toList());
        System.out.println(wordsArray);

        List<String> upperCaseWords = sentences.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseWords);

        // using flatMap
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println(words);
    }
}
