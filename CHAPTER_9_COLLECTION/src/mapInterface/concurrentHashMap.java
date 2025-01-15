package mapInterface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Initial map:" + map);

        Thread t1 = new Thread(() -> {
            map.put("D", 4);
            System.out.println("Thread 1 added D: " + map);
        });
        Thread t2 = new Thread(() -> {
            map.put("E", 5);
            System.out.println("Thread 2 added E: " + map);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final map: " + map);

    }
}
