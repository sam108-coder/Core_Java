package setInterface.hashSet;

import java.util.HashSet;

public class Test3 {
    public static void main(String[] args) {
        HashSet hs = new HashSet(5, .80f);

        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        hs.add("aaa");
        hs.add("eee");
        hs.add("fff");
        System.out.println(hs);
    }
}
