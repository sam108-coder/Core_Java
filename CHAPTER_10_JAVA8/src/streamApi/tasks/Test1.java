package streamApi.tasks;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println("----Using Stream Api----");
        al.stream().filter(e -> e > 30).forEach(e -> System.out.println(e));

        System.out.println("----Using Functional Interface----");

        Stream<Integer> s = al.stream();

        Predicate<Integer> p = (e) -> {
            return e > 30;
        };

        Consumer<Integer> c = (e) -> {
            System.out.println(e);
        };
        s.filter(p).forEach(c);


    }
}
