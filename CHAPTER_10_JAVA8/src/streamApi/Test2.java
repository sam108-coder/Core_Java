package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("----Using Collections and Simple Logic-----");
        for (int i : al) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("----Using Stream Api (first part) -----");
        Stream<Integer> s1 = al.stream();
        List<Integer> l = s1.filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(l);

        System.out.println("----Using Stream api (Second part) -----");
        Stream<Integer> s2 = al.stream();
        s2.filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

        System.out.println("----Using Stream api (Third part) -----");
        al.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

        System.out.println("----Count Even Numbers-----");
        System.out.println(al.stream().filter(e -> e % 2 == 0).count());

        System.out.println("----Method Chaining-----");
        String name = "deepak";
        String str1 = name.concat("Java");
        String str2 = str1.toUpperCase();
        int l1 = str2.length();
        System.out.println(l1);

        int leng = name.concat("Java").toUpperCase().length();
        System.out.println(leng);

    }
}
