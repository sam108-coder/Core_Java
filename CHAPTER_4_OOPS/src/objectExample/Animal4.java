package objectExample;

public class Animal4 {

    int age;
    String color;

    void eat() {
        System.out.println("I am eating");
    }

    void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        Animal4 buzo = new Animal4();
        buzo.age = 10;
        buzo.color = "brown";
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);
        buzo.eat();
        buzo.run();
        System.out.println("----------------------");

        Animal4 cat = new Animal4();
        cat.age = 20;
        cat.color = "black";
        System.out.println("Age : " + cat.age);
        System.out.println("Color : " + cat.color);
        cat.eat();
        cat.run();


    }
}
