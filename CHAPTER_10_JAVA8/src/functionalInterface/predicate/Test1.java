package functionalInterface.predicate;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        Predicate<Integer> ob = no -> no % 2 == 0;
        System.out.println(ob.test(10));
    }
}
