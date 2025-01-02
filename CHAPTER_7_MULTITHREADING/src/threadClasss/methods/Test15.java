package threadClasss.methods;

class MyThread15 extends Thread {
    public void run() {
        System.out.println("Is thread interrupted (1) : " + Thread.interrupted());
        System.out.println("Is thread interrupted (2) : " + Thread.interrupted());
        System.out.println("Is thread interrupted (3) : " + Thread.interrupted());
        System.out.println("Is thread interrupted (4) : " + Thread.interrupted());
        System.out.println("Is thread interrupted (5) : " + Thread.interrupted());

        System.out.println("Is thread interrupted (1) : " + Thread.currentThread().isInterrupted());
        System.out.println("Is thread interrupted (2) : " + Thread.currentThread().isInterrupted());

    }
}

public class Test15 {
    public static void main(String[] args) {
        MyThread15 mt = new MyThread15();
        mt.start();
        mt.interrupt();
    }
}
