package mapInterface.weakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Test2 {
    public static void main(String[] args) {
        Integer i1=new Integer(101);
        Integer i2=new Integer(102);

    //    HashMap hm=new HashMap();

        WeakHashMap hm=new WeakHashMap();
        hm.put(i1,"deepak");
        hm.put(i2,"rahul");
        i2=null;
        System.gc();
        System.out.println(hm);
    }
}
