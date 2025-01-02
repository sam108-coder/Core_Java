package threadGroup;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("--------------------------------");

        ThreadGroup tg = new ThreadGroup("Sub-tg");

        Thread t1 = new Thread(tg, "deepak thread");
        t1.start();

        Thread t2 = new Thread(tg, "rahul thread");
        t2.start();

        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());

        tg.setMaxPriority(7);
        System.out.println(tg.getMaxPriority());
        System.out.println(t2.getPriority());

        ThreadGroup sub_tg = new ThreadGroup(tg, "sub_sub_tg");
        System.out.println(sub_tg.getMaxPriority());

    }
}
