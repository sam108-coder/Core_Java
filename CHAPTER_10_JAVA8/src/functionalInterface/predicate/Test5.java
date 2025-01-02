package functionalInterface.predicate;

import java.util.function.Predicate;

public class Test5 {
    public static void main(String[] args) {
        Predicate<String> p1 = pass -> pass.length() > 6;
        System.out.println(p1.test("abc12345"));

        Predicate<String> p2 = pass -> pass.equals("admin@123");
        System.out.println(p2.test("deepak@123"));

        System.out.println("----------------------");

        Predicate p = p1.and(p2);
        System.out.println(p.test("admin@12"));

        System.out.println("----------------------");

        Predicate p3 = p1.or(p2);
        System.out.println(p3.test("admin@12"));
    }
}
