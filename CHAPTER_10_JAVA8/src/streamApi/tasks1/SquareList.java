package streamApi.tasks1;

import java.util.Arrays;
import java.util.List;

public class SquareList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        num.stream().map(n -> n * n).forEach(System.out::println);

        System.out.println("*****************");

        int[] numArr = new int[]{1, 2, 3, 4, 5};
        Arrays.stream(numArr)
                .mapToDouble(a -> Math.pow(a, 2))
                .mapToInt(doubleVal -> (int) doubleVal)
                .forEach(System.out::println);

    }
}
