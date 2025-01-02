package setInterface.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Test4 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        System.out.println(al.get(0));

        HashSet hs=new HashSet();
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");

    //    hs.clear();
        System.out.println(hs);

        System.out.println(hs.contains("aaa"));
        hs.remove("aaa");

        System.out.println(hs.size());
        System.out.println(hs);
    }
}
