package streamApi.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(2);
        al.add(5);
        al.add(3);

        Stream<Integer> s = al.stream();
        //    List<Integer> l = s.filter(e -> e % 2 == 0).collect(Collectors.toList());

        // 1st Way to get the sum of even numbers
       /* Stream<Integer> s2 = s.filter(e -> e % 2 == 0);
        IntStream is = s2.mapToInt(Integer::intValue);
        System.out.println(is.sum());*/

        // 2nd way to get the sum of even numbers
       /* int res = s.filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(res);*/

        int sum = 0;
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            sum = sum + itr.next();
        }
        System.out.println(sum);

    }
}
