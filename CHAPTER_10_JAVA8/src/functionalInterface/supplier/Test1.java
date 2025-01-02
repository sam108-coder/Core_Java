package functionalInterface.supplier;

import java.util.function.Supplier;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(Math.random());

        System.out.println("---------------------------");

        System.out.println((Math.random() * 100));
        Supplier<Integer> s1 = () -> (int) (Math.random() * 100);

        System.out.println("---------------------------");

        Supplier<String> s = () -> {
            String[] names = {"deepak", "amit", "rahul", "deepesh", "kunal"};
            int i = (int) (Math.random() * 4);
            return names[i];
        };
        System.out.println(s.get());
    }
}
