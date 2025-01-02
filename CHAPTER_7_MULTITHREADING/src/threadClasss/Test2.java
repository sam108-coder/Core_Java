package threadClasss;

class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Child Thread : " + i);
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Main Thread : " + i);
        }
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
