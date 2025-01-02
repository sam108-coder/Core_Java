package threadLocal;

class ThreadTask1 implements Runnable {
    ThreadLocal tl;

    public ThreadTask1(ThreadLocal tl) {
        this.tl = tl;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " + tl.get());
    }
}

public class Tset1 {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal();
        tl.set(100);
        System.out.println(Thread.currentThread().getName() + " : " + tl.get());

        ThreadTask1 tt = new ThreadTask1(tl);
        Thread t = new Thread(tt);
        t.start();

    }
}
