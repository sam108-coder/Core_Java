package streamApi.tasks1;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);
        nums.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
        System.out.println();

        int[] numsArr = {10, 24, 25, 21, 86, 95, 100};
        Arrays.stream(numsArr)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        System.out.println("****Odd Number****");
        Arrays.stream(numsArr)
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);


    }
}
