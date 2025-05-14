package youtube.listdemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        System.out.println(list.size());
        list.add("priya");
        list.add(10);
        list.add(200.8);
        list.add(true);
        list.add(new ArrListDemo());
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        // Iterator, ListIterator, forEach
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
