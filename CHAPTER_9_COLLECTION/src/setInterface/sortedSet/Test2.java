package setInterface.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet();
        ss.add("aaa");
        ss.add("ccc");
        ss.add("bbb");
        ss.add("eee");
        ss.add("ddd");

        System.out.println(ss);

        System.out.println(ss.first());
        System.out.println(ss.last());

        System.out.println(ss.headSet("ccc"));
        System.out.println(ss.tailSet("ccc"));
        System.out.println(ss.subSet("bbb", "eee"));
    }
}
