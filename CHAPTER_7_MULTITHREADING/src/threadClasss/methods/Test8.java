package threadClasss.methods;

class MyThread8 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i + ":" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Test8 {
    public static void main(String[] args) {

        MyThread8 mt = new MyThread8();
        mt.start();

        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i + ":" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
