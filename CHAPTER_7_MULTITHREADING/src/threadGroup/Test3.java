package threadGroup;

public class Test3 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Main-Sub-Thread-Group");

        Thread t1 = new Thread(tg, "deepak thread");
        Thread t2 = new Thread(tg, "amit thread");
        t1.start();
        t2.start();

        System.out.println(tg.activeCount());
        System.out.println(tg.getParent().activeCount());

        System.out.println(tg.activeGroupCount());
        System.out.println(tg.getParent().activeGroupCount());
        System.out.println(tg.getParent().getParent().activeGroupCount());
    }
}
