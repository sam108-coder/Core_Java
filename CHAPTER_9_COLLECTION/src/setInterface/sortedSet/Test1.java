package setInterface.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet();
       /* ss.add(10);
        ss.add(30);
        ss.add(80);
        ss.add(60);
        ss.add(20);
        System.out.println(ss);*/

        ss.add("aaa");
        ss.add("ccc");
        ss.add("fff");
        ss.add("bbb");
    //    ss.add(new StringBuffer("ddd"));
        System.out.println(ss);
    }
}
