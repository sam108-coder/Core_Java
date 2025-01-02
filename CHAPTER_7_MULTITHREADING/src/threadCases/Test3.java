package threadCases;

// Performing Multiple Task from Multiple Thread

class MyThread3 extends Thread {
    public void run() {
        System.out.println("hi");
    }
}

class MyThread4 extends Thread {
    public void run() {
        System.out.println("hello");
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Hey");
    }
}

public class Test3 {
    public static void main(String[] args) {
        MyThread3 mt1 = new MyThread3();
        mt1.start();

        MyThread4 mt2 = new MyThread4();
        mt2.start();

        MyThread5 mt3 = new MyThread5();
        mt3.start();
    }
}
