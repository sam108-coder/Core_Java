package runnableInterface;

class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("hi");
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2();
        mt2.start();
    //    mt2.start();  // It will provide an exception because we can start one thread 2 times.
    }
}
