package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyThreadTask mt = new MyThreadTask();

//        Thread t = new Thread(mt);
//        t.start();

        ExecutorService es = Executors.newFixedThreadPool(10);
        es.submit(mt);
        es.shutdown();
    }
}
