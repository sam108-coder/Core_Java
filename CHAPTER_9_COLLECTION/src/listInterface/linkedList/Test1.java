package listInterface.linkedList;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("deepak");
        ll.add("bbb");
        ll.add("rahul");
        ll.addFirst("aaa");
    //    ll.addLast("mmm");
        ll.add(3,"amit");
        System.out.println(ll);
    }
}
