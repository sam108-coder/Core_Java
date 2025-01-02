package lambdaExp;

public class Test9 implements Runnable {


    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi i am child thread");
        }
    }

    public static void main(String[] args) {
        Test9 ob = new Test9();
        Thread t = new Thread(ob);
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("hi I am main thread");
        }
    }


}
