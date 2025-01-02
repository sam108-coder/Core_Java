package streamApi.tasks;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(20);
        al.add(50);
        al.add(30);
        Stream<Integer> s = al.stream();

        //Ascending sorted
        s.sorted().forEach(e -> System.out.println(e));

        //Descending sorted
        //      s.sorted((x, y) -> -x.compareTo(y)).forEach(e -> System.out.println(e));
    }
}
