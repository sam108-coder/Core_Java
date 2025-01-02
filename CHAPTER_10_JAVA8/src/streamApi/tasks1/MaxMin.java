package streamApi.tasks1;

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);
        int max = num.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max : " + max);
        System.out.println();

        max = num.stream()
                .mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max);

        int[] numArr = {12, 67, 86, 53, 11, 90, 82, 86, 25};
        OptionalInt optNum = Arrays.stream(numArr).max();
        optNum.ifPresent(max1 -> System.out.println("Max no : " + max1));
        System.out.println();

        System.out.println("*****Minimum*****");
        int min = num.stream()
                .min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
        System.out.println();

        min = num.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(min);
        System.out.println();

        min = Arrays.stream(numArr).min().getAsInt();
        System.out.println(min);

    }
}
