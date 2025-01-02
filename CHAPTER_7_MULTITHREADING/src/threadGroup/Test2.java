package threadGroup;

public class Test2 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Main-sub-thread-group");

        Thread t1 = new Thread(tg, "deepak thread");
        Thread t2 = new Thread(tg, "amit thread");

        System.out.println("Current Thread-Group name : " + tg.getName());
        System.out.println("Parent Thread-Group name : " + tg.getParent().getName());

        System.out.println("Old Priority of Thread-Group : " + tg.getMaxPriority());
        tg.setMaxPriority(7);
        System.out.println("New Priority of Thread Group : " + tg.getMaxPriority());
        tg.list();

    }
}
