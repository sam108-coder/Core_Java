package functionalInterface.function;

import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        Function<String, Integer> f = str -> str.length();
        System.out.println(f.apply("deepak"));
        System.out.println(f.apply("amit"));
    }
}
