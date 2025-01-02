package interfaces;

interface Vehicle1 {
    void start();

    void noOfGears(int a);
}

abstract class Bus implements Vehicle1 {
    public void start() {
        System.out.println("Bus Starts With KEY");
    }
}

class Car implements Vehicle1 {

    @Override
    public void start() {
        System.out.println("Car Starts With Key");
    }

    @Override
    public void noOfGears(int gears) {
        System.out.println("Car has " + gears + " gears");
    }
}

class Scooter implements Vehicle1 {

    @Override
    public void start() {
        System.out.println("Scooter Starts With KICK");
    }

    @Override
    public void noOfGears(int gears) {
        System.out.println("Scooter has " + gears + " gears");
    }
}

public interface VehicleDemo {
    public static void main(String[] args) {
        //  Vehicle1 v=new Vehicle(); //'Vehicle' is abstract; cannot be instantiated
        //  Bus b=new Bus(); // 'Bus' is abstract; cannot be instantiated
        //  b.start();

        Car c = new Car();
        c.start();
        c.noOfGears(4);

        System.out.println("--------------------------------");

        Scooter s = new Scooter();
        s.start();
        s.noOfGears(5);

    }
}
