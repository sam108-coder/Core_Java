package queueInterface.arrayDeque;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("aaa");
        pq.offer("bbb");
        pq.offer("ccc");
        pq.offer("ddd");
        pq.offer("eee");
        pq.offer("fff");
        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq);

        System.out.println(pq.element());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.remove());
        System.out.println(pq);
    }
}
