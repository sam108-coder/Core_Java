package streamApi.tasks;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("deepak");
        al.add("amit");
        al.add("rahul");
        al.add("deepesh");
        al.add("kamal");

        Stream<String> s = al.stream();

        //    s.map(e -> e.charAt(0)).forEach(e -> System.out.println(e));

        String name = "deepak";
        //    System.out.println(name.replace("a","z"));

        s.map(e -> e.replace("a", "z")).forEach(e -> System.out.println(e));


    }
}
