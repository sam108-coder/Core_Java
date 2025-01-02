package threadClasss.realWorld;


class BookTrainSeat {
    int total_seats = 10;

    public void bookSeat(int seats, String name) {
        if (total_seats >= seats) {
            System.out.println(name + " booked " + seats + " seats successfully");
            total_seats = total_seats - seats;
            System.out.println("Total seats Left : " + total_seats);
        } else {
            System.err.println(name + " Sorry ...!! seats Not Booked");
            System.err.println("Total Seats Left : " + total_seats);
        }
    }
}

class MyThread1 extends Thread {
    BookTrainSeat bts;
    int seats;

    public MyThread1(BookTrainSeat bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    public void run() {
        bts.bookSeat(seats, Thread.currentThread().getName());
    }
}

public class TrainReservation {
    public static void main(String[] args) {
        BookTrainSeat bts = new BookTrainSeat();

        MyThread1 mt1 = new MyThread1(bts, 5);
        mt1.setName("Deepak");
        mt1.start();

        MyThread1 mt2 = new MyThread1(bts, 3);
        mt2.setName("Amit");
        mt1.start();

        MyThread1 mt3 = new MyThread1(bts, 4);
        mt3.setName("Rahul");
        mt3.start();


    }
}
