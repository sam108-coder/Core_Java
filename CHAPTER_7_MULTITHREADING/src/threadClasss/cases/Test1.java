package threadClasss.cases;

class Abc1 extends Thread {

    public void run() {
        System.out.println("hi");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Abc1 ob1 = new Abc1();
        ob1.start();
    }
}
