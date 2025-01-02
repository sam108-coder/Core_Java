package threadClasss.methods;

class MyThread9 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ":" + Thread.currentThread().getName());
        }
    }
}

public class Test9 {
    public static void main(String[] args) {
        MyThread9 mt = new MyThread9();
        mt.start();

        Thread.yield();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ":" + Thread.currentThread().getName());
        }
    }
}
