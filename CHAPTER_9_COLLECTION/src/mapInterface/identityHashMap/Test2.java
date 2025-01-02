package mapInterface.identityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test2 {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        HashMap hm = new HashMap();
        hm.put(i1, "deepak");
        hm.put(i2, "rahul");
        System.out.println(i1.equals(i2));
        System.out.println(hm);

        System.out.println("-------------------");

        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(i1, "deepak");
        ihm.put(i2, "rahul");
        System.out.println(i1 == i2);
        System.out.println(ihm);


    }
}
