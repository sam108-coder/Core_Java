package threadClasss.realWorld;

class TakeAdmission extends Thread {
    public void run() {
        try {
            System.out.println("------Admission Starts------");
            Thread.sleep(5000);
            System.out.println("You have taken admission successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class DepositFee extends Thread {
    public void run() {
        try {
            System.out.println("------Depositing Fee------");
            Thread.sleep(3000);
            System.out.println("You have deposit the Fee successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class TakeRollNo extends Thread {

    public void run() {
        try {
            System.out.println("------Take Roll No------");
            Thread.sleep(1000);
            System.out.println("Now you can sit in Exams");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class CollegeAdmission {
    public static void main(String[] args) throws InterruptedException {
        TakeAdmission t1 = new TakeAdmission();
        t1.start();
        t1.join();

        DepositFee t2 = new DepositFee();
        t2.start();
        t2.join();

        TakeRollNo t3 = new TakeRollNo();
        t3.start();
    }
}
