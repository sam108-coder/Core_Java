package mapInterface.treeMap;

import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap<>();
        tm.put(106, "priya");
        tm.put(101, "deepak");
        tm.put(103, "amit");
        tm.put(102, "rahul");
        tm.put(105, "kamal");
        tm.put(104, "deepesh");
    //    tm.put("abc", "deepika");
    //    tm.put(null, "deepika");
        tm.put(102, "rrr");
        System.out.println(tm);
    }
}
