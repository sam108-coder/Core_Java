package abstraction;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Starts With Key");
    }
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("Starts With Kick");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Car ob = new Car();
        ob.start();
        System.out.println("-----------------------");

        Scooter ob2 = new Scooter();
        ob2.start();

    }

}
