package streamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("deepesh");
        al.add("rahul");
        al.add("amit");
        al.add("deepak");
        al.add("ankit");
        Stream<String> s = al.stream();
//        s.forEach(e -> System.out.println(e));
        //   s.sorted().forEach(e -> System.out.println(e));

        s.sorted((x, y) -> -x.compareTo(y)).forEach(e -> System.out.println(e));
    }
}
