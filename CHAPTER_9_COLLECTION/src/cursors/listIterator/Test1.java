package cursors.listIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("ddd");

        System.out.println("-----Forward Direction-----");
        ListIterator li = al.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("-----Backward Direction-----");
        while (li.hasNext()) {
            System.out.println(li.previous());
        }
    }
}
