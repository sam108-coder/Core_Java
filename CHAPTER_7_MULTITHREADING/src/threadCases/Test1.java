package threadCases;

// Performing Single Task from Single Thread

class MyThread1 extends Thread {
    public void run() {
        System.out.println("hi");
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        mt1.start();
    }
}
