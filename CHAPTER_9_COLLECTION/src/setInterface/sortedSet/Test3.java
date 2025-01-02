package setInterface.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet();
        ss.add(10);
        ss.add(30);
        ss.add(20);
        ss.add(50);
        ss.add(40);

        System.out.println(ss);

        System.out.println(ss.first());
        System.out.println(ss.last());

        System.out.println(ss.headSet(30));
        System.out.println(ss.tailSet(30));
        System.out.println(ss.subSet(20, 50));
    }
}
