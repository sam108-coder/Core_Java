package setInterface.navigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        NavigableSet ns = new TreeSet();
        ns.add(10);
        ns.add(20);
        ns.add(30);
        ns.add(40);
        ns.add(50);
        ns.add(60);
        System.out.println(ns.descendingSet());

        System.out.println(ns.ceiling(30));
        System.out.println(ns.higher(40));
        System.out.println(ns.floor(20));
        System.out.println(ns.lower(20));
        System.out.println(ns.pollFirst());
        System.out.println(ns.pollLast());


    }
}
