package runnableInterface;

class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread : " + i);
        }
    }

    void show() {
        System.out.println("hi");
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();

        Thread t = new Thread(mt1);
        t.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread : " + i);
        }
        mt1.show();
    }
}
