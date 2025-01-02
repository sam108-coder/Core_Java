package listInterface.linkedList;

import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("deepak");
        ll.add("rahul");
        ll.add("amit");
        ll.add("aaa");
        ll.add("bbb");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll);
    }
}
