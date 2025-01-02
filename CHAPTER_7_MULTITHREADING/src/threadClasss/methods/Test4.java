package threadClasss.methods;

public class Test4 extends Thread {

    public void run() {
        System.out.println("Hi");
        System.out.println("Child Thread : " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        t4.setDaemon(true);
        t4.start();
        System.out.println("Main Thread : " + Thread.currentThread().isDaemon());
    }
}
