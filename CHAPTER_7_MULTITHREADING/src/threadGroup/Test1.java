package threadGroup;

public class Test1 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getThreadGroup().getName();
        System.out.println("Current Thread-Group name : " + name);
        String parent_name = Thread.currentThread().getThreadGroup().getParent().getName();
        System.out.println("Parents Thread-Group name : " + parent_name);
    }
}
