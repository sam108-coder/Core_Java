package functionalInterface.predicate;

import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        Predicate<String> p = str -> str.length() > 6;
        System.out.println(p.test("abc"));
        System.out.println(p.test("deepak@123"));
    }
}
