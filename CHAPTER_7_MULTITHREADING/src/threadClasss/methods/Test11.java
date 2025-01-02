package threadClasss.methods;

class MyThread11 extends Thread {
    Thread t;

    MyThread11(Thread t) {
        this.t = t;
    }

    public void run() {
        try {
            t.join();
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Test11 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        MyThread11 mt = new MyThread11(t);
        mt.start();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
