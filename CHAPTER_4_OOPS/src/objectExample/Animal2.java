package objectExample;

public class Animal2 {

    int age = 10;
    String color = "black";

    void eat() {
        System.out.println("I am eating");
    }

    void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        Animal2 buzo = new Animal2();
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);
        buzo.eat();
        buzo.run();

    }
}
