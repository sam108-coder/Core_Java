package mapInterface.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Map map = Collections.synchronizedMap(hm);
        HashMap hm2 = new HashMap(map);
    }
}
