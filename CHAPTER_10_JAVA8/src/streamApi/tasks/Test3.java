package streamApi.tasks;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("deepak");
        al.add("amit");
        al.add("rahul");
        al.add("deepesh");
        al.add("kamal");

        Stream<String> s = al.stream();
        s.filter(e -> e.startsWith("a")).forEach(e -> System.out.println(e));
    }
}
