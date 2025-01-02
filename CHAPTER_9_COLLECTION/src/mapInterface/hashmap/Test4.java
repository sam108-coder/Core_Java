package mapInterface.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("101", "deepak");
        hm.put("102", "amit");
        hm.put("103", "rahul");
        hm.put("104", "deepesh");
        hm.put("105", "priya");

        for (Map.Entry me : hm.entrySet()) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
