package listInterface.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("deepak");
        al.add("rahul");
        al.add("amit");
        al.add("aaa");
        al.add("bbb");

        LinkedList ll = new LinkedList(al);
        ll.add("xxx");
        ll.addFirst("ccc");
        System.out.println(ll);
    }
}
