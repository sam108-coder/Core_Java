package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // 1st Way to get stream instance
        Stream<Integer> s1 = al.stream();
        s1.forEach(e -> System.out.println(e));

        System.out.println("----------");

        // 2nd Way to get stream instance
        Stream s2 = Stream.of(al);
        s2.forEach(e -> System.out.println(e));

        System.out.println("----------");

        // 3rd Way to get stream instance
        //  Stream<Integer> s3 = Stream.of(100, 200, 300, 400, 500);
        Stream<String> s3 = Stream.of("deepak", "rahul", "amit", "deepesh", "Kamal");
        s3.forEach(e -> System.out.println(e));

        System.out.println("----------");

        // 4t Way to get stream instance
        int[] arr = {600, 700, 800, 900, 1000};
        IntStream s4 = Arrays.stream(arr);
        s4.forEach(e -> System.out.println(e));

        System.out.println("----------");

        // 5th Way to get stream instance
        Stream<Object> s5 = Stream.empty();

        System.out.println("----------");

        // 6th Way to get stream instance
        Stream<Object> s6 = Stream.builder().build();
    }
}
