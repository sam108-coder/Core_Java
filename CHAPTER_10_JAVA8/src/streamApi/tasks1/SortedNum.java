package streamApi.tasks1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedNum {
    public static void main(String[] args) {
        System.out.println("****Ascending Order****");
        List<Integer> num = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);
        num.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("****Descending Order****");
        List<Integer> num2 = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);
        num.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .forEach(System.out::println);

        System.out.println();

        System.out.println("****Ascending Order****");
        int[] numArr = {10, 24, 25, 21, 86, 95, 100};
        Arrays.stream(numArr)
                .sorted()
                .forEach(System.out::println);


        System.out.println("****Descending Order****");
        int[] numArr1 = {10, 24, 25, 21, 86, 95, 100};
        Arrays.stream(numArr)
                //       .boxed()
                //       .mapToObj(num1->Integer.valueOf(num1))
                .mapToObj(Integer::valueOf)
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);
    }
}
