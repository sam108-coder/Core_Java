package threadClasss.cases;

class Abc4 extends Thread {
    public void run() {
        System.out.println("hi");
    }

    public void run(int a) {
        System.out.println(a);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Abc4 ob1 = new Abc4();
        ob1.start();
        ob1.run(10);
    }
}
