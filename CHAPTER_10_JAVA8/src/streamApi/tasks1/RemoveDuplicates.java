package streamApi.tasks1;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25, 12);
        num.stream()
                .distinct().forEach(System.out::println);

        System.out.println("*****************");

        int[] numArr = new int[]{12, 67, 86, 53, 11, 90, 82, 86, 25, 12};
        Arrays.stream(numArr).distinct().forEach(System.out::println);
    }
}
