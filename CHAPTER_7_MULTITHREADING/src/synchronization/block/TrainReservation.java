package synchronization.block;


class BookTrainSeats {
    int total_seats = 10;

    void bookSeats(int seats, String name) {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(name + " booked " + seats + " seats successfully");
                total_seats = total_seats - seats;
                System.out.println("Total Seats Left : " + total_seats);
            } else {
                System.out.println(name + " sorry ...!! seats not left");
                System.out.println("Total Seats left : " + total_seats);
            }
        }
    }
}

class MyThread extends Thread {
    BookTrainSeats bts;
    int seats;

    public MyThread(BookTrainSeats bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    public void run() {
        bts.bookSeats(seats, Thread.currentThread().getName());

    }
}

public class TrainReservation {
    public static void main(String[] args) {
        BookTrainSeats bts = new BookTrainSeats();

        MyThread mt1 = new MyThread(bts, 5);
        mt1.setName("Deepak");
        mt1.start();

        MyThread mt2 = new MyThread(bts, 3);
        mt2.setName("Amit");
        mt2.start();

        MyThread mt3 = new MyThread(bts, 4);
        mt3.setName("Rahul");
        mt3.start();


    }
}
