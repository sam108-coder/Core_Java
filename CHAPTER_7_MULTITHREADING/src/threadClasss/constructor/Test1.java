package threadClasss.constructor;

public class Test1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Thread t = new Thread(t1, "deepak");
        t.start();

        Thread t2=new Thread(t1);
        Thread t3=new Thread();
    }
}
