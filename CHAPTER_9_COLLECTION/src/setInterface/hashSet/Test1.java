package setInterface.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("fff");
        hs.add(10);
        hs.add("ccc");
        hs.add("ddd");
        hs.add("sss");
        hs.add("ggg");
        System.out.println(hs);
    }
}
