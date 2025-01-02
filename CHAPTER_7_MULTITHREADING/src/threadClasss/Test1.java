package threadClasss;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("hi");
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
