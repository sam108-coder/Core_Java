package threadClasss.methods;

class MyThtead10 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Test10 {
    public static void main(String[] args) {
        MyThtead10 mt = new MyThtead10();
        mt.start();

        try {
            mt.join();

            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
