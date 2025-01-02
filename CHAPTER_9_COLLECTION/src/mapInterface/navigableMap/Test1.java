package mapInterface.navigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        NavigableMap nm = new TreeMap();
        nm.put(101, "deepak");
        nm.put(103, "amit");
        nm.put(102, "rahul");
        nm.put(105, "kamal");
        nm.put(104, "deepesh");
        nm.put(106, "priya");

        System.out.println(nm);

        System.out.println(nm.descendingMap());
        System.out.println(nm.ceilingKey(103));
        System.out.println(nm.ceilingEntry(103));
        System.out.println(nm.higherEntry(103));
        System.out.println(nm.lowerEntry(103));
        System.out.println(nm.floorEntry(104));
        System.out.println(nm.pollFirstEntry());
        System.out.println(nm);

        System.out.println(nm.pollLastEntry());
        System.out.println(nm);
    }
}
