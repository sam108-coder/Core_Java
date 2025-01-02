package mapInterface.linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test1 {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap<>();
        lhm.put("101", "deepak");
        lhm.put("102", "amit");
        lhm.put("103", "rahul");
        lhm.put("104", "deepesh");
        lhm.put("105", "priya");

        System.out.println(lhm);
        System.out.println(lhm.size());
        System.out.println(lhm.remove("101"));
        System.out.println(lhm);
        System.out.println(lhm.containsValue("deepesh"));
        System.out.println(lhm.containsKey("105"));
    }
}
