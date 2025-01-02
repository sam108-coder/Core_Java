package threadClasss.methods;

class MyThread5 extends Thread {

    public void run() {
        System.out.println("Hi");
        System.out.println("Child Thread : " + Thread.currentThread().isDaemon());
    }
}

public class Test5 {

    public static void main(String[] args) {
        //    Thread.currentThread().setDaemon(true); // exception

        MyThread5 mt5 = new MyThread5();
        mt5.setDaemon(true);
        mt5.start();

    //    mt5.setDaemon(true); // exception
        System.out.println("Main Thread : " + Thread.currentThread().isDaemon());


    }
}
