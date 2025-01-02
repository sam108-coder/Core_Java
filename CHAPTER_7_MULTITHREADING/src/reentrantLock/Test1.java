package reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

class BookTicket {
    ReentrantLock re = new ReentrantLock();
    int total_seats = 10;

    void bookTicket(int seats) {
        re.lock();
        re.lock();
        re.lock();
        if (total_seats >= seats) {
            System.out.println("Success");
            total_seats = total_seats - seats;
            System.out.println("Seats Left : " + total_seats);
        } else {
            System.out.println("Fail");
        }
        try {
            System.out.println("------------------------");
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        re.unlock();
        m1();
    }

    void m1() {
        System.out.println("Hiiii");
        re.unlock();
        re.unlock();
    }
}

class MyThread1 extends Thread {
    BookTicket bt;
    int seats;

    MyThread1(BookTicket bt, int seats) {
        this.bt = bt;
        this.seats = seats;
    }

    public void run() {
        bt.bookTicket(seats);
    }
}

public class Test1 {
    public static void main(String[] args) {
        BookTicket bt = new BookTicket();

        MyThread1 t1 = new MyThread1(bt, 7);
        t1.start();

        MyThread1 t2 = new MyThread1(bt, 4);
        t2.start();
    }
}
