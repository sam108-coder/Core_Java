package streamApi.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("deepak");
        al.add("amit");
        al.add("rahul");
        al.add("deepesh");
        al.add("kamal");

        Stream<String> s = al.stream();
    //    s.filter(e -> e.length() > 5).forEach(e -> System.out.println(e));

        List<String> l = s.filter(e -> e.length() > 5).collect(Collectors.toList());
        System.out.println(l);

    }
}
