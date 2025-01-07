package streamApi.tasks1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumAverage {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);
        int sum = num.stream()
                //       .mapToInt(n -> n.intValue())
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
        System.out.println();

        Optional<Integer> optNum = num.stream().reduce((x, y) -> x + y);
        optNum.ifPresent(System.out::println);
        System.out.println();


        int[] numArr = {12, 67, 86, 53, 11, 90, 82, 86, 25};
        int total = Arrays.stream(numArr).sum();
        System.out.println(total);

        System.out.println("Average for list of integers");
        OptionalDouble optAvg = num.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        if (optAvg.isPresent())
            System.out.println("Avg " + optAvg.getAsDouble());

        System.out.println("Average for list of integers");
        optAvg = Arrays.stream(numArr).average();
        optAvg.ifPresent(System.out::println);
    }
}
