package setInterface.navigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        NavigableSet ns=new TreeSet();
        ns.add("aaa");
        ns.add("bbb");
        ns.add("ccc");
        ns.add("ddd");
        ns.add("eee");
        ns.add("fff");
        System.out.println(ns.descendingSet());

        System.out.println(ns.ceiling("ccc"));
        System.out.println(ns.higher("ddd"));
        System.out.println(ns.floor("bbb"));
        System.out.println(ns.lower("bbb"));
        System.out.println(ns.pollFirst());
        System.out.println(ns.pollLast());


    }
}
