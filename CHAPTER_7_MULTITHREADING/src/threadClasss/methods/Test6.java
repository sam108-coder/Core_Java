package threadClasss.methods;

class MyThread6 extends Thread {
    public void run() {
        System.out.println("Hi : " + Thread.currentThread().getName());
        System.out.println("Child Thread Priority : " + Thread.currentThread().getPriority());
    }
}

public class Test6 {
    public static void main(String[] args) {
        MyThread6 mt = new MyThread6();
        mt.start();

        //    mt.setPriority(8);
        //    System.out.println("Child Thread Priority : " + mt.getPriority());

        Thread.currentThread().setPriority(8);
        System.out.println("Hello : " + Thread.currentThread().getName());
        System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());
    }
}
