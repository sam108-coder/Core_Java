package mapInterface.sortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        SortedMap sm = new TreeMap();
        sm.put(101, "deepak");
        sm.put(103, "amit");
        sm.put(102, "rahul");
        sm.put(105, "kunal");
        sm.put(104, "deepesh");
        sm.put(106, "priya");
        System.out.println(sm);

        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap(104));
        System.out.println(sm.tailMap(104));
        System.out.println(sm.subMap(102, 105));
    }
}
