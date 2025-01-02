package streamApi.tasks1;

import java.util.stream.IntStream;

public class EvenOddRange {
    public static void main(String[] args) {

        System.out.println("***Even Number***");
        IntStream.rangeClosed(10, 100)
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(num + " "));

        System.out.println();
        System.out.println("***Odd Number***");
        IntStream.rangeClosed(10, 100)
                .filter(num -> num % 2 != 0)
                .forEach(num -> System.out.print(num + " "));
    }
}
