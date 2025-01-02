package logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMaxWord {
    public static void main(String[] args) {
        String str = "I am a good programmer";
        List<String> words = Arrays.asList(str.split(" "));
        Optional<String> secondMaxWord = words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(1) .findFirst();
        secondMaxWord.ifPresent(word -> System.out.println("The second largest word is: " + word));
    }

}
