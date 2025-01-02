package threadLocal;

class ThreadTask implements Runnable {

    ThreadLocal tl = new ThreadLocal();

    @Override
    public void run() {
        tl.set("deepak");
        System.out.println("Hi : " + tl.get());
        display();
    }

    void display() {
        System.out.println("Hi : " + tl.get());
        tl.remove();
        System.out.println("Hi : " + tl.get());
    }
}

public class Test {
    public static void main(String[] args) {
        ThreadTask tt = new ThreadTask();
        Thread t = new Thread(tt);
        t.start();
    }
}
