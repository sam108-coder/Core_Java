package annonymousThread;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Hi : " + i);
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Hello : " + i);
                }
            }
        };
        t2.start();
    }
}
