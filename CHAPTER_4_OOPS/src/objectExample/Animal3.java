package objectExample;

public class Animal3 {

    int age = 10;
    String color = "black";

    void eat() {
        System.out.println("I am eating");
    }

    void run() {
        System.out.println("I am running");
    }


    public static void main(String[] args) {
        Animal3 buzo = new Animal3();
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);
        buzo.eat();
        buzo.run();

        System.out.println("*******************");

        Animal3 cat = new Animal3();
        System.out.println("Age : " + cat.age);
        System.out.println("Color : " + cat.color);
        cat.eat();
        cat.run();
    }
}
