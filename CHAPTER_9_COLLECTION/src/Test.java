import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] list = {"Apurv", "Amit", "Akash"};
        List<String> list1 = Arrays.asList(list);
        list1.stream().filter(i -> i.length() == 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
