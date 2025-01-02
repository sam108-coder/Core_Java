package setInterface.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add(100);

        HashSet hs = new HashSet(al);
        hs.add("fff");
        hs.add(10);
        hs.add("ccc");
        hs.add("ddd");
        hs.add("sss");
        hs.add("ggg");
        System.out.println(hs);
    }
}
