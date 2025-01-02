package mapInterface.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("101", "deepak");
        hm.put("102", "amit");
        hm.put("103", "rahul");
        hm.put("104", "deepesh");
        hm.put("105", "priya");

        Set set = hm.entrySet();
        Iterator itr = set.iterator();
        HashMap hm2 = new HashMap();
        while (itr.hasNext()) {
            //    System.out.println(itr.next());

            Map.Entry entry = (Map.Entry) itr.next();
            if (entry.getKey().equals("103")) {
                System.out.println(entry.setValue("aaa"));
                hm2.put(entry.getKey(), entry.getValue());
            } else {
                hm2.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(hm2);


    }
}
